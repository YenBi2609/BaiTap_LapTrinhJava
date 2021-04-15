package CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUserBuffer {
    public static void main(String[] args) {
        File fileIn;

        FileInputStream in = null;

        FileOutputStream out = null;

        long startTime, elapsedTime; // for speed benchmarking

        try {

            fileIn = new File("D:\\b.jpg");

            System.out.println("File size is " + fileIn.length() + " bytes");

            in = new FileInputStream(fileIn);

            out = new FileOutputStream("D:\\c.jpg");

            startTime = System.nanoTime();
            int[] bufSizeKB = {1, 2, 4, 8, 16, 32, 64, 256, 1024}; // in KB

            for (int run = 0; run < bufSizeKB.length; run++)

            {

                int bufSize = bufSizeKB[run] * 1024;

                byte[] byteBuf = new byte[bufSize];

                int numBytesRead;

                while ((numBytesRead = in.read(byteBuf)) != -1) {

                    out.write(byteBuf, 0, numBytesRead);

                }

                elapsedTime = System.nanoTime() - startTime;

                System.out.println(bufSizeKB[run] + "KB : " + (elapsedTime / 1000000.0) + " msec");

            }

//            byte[] byteBuf = new byte[4096]; // 4K buffer

        } catch (IOException ex) {

            ex.printStackTrace();

        } finally { // always close the streams

            try {

                if (in != null) in.close();

                if (out != null) out.close();

            } catch (IOException ex) { ex.printStackTrace(); }

        }
    }
}
