package CopyFile;

import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        File fileIn;

        BufferedInputStream in = null;

        BufferedOutputStream out = null;

        long startTime, elapsedTime; // for speed benchmarking

        try {
            fileIn = new File("D:\\a.jpg");

            System.out.println("File size is " + fileIn.length() + " bytes");

            in = new BufferedInputStream(new FileInputStream(fileIn));

            out = new BufferedOutputStream(new FileOutputStream("D:\\e.jpg"));

            startTime = System.nanoTime();

            int byteRead;

            while ((byteRead = in.read()) != -1) {

                out.write(byteRead);

            }

            elapsedTime = System.nanoTime() - startTime;

            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

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
