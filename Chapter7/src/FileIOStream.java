import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args){
        try {
            FileInputStream in = new FileInputStream("D:\\source.txt");
            FileOutputStream out = new FileOutputStream("D:\\destination.txt");
            int c;
            while ((c = in.read()) != -1) {

                out.write(c);
            }
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
