import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        try {
            FileWriter fos = new FileWriter("C:\\abc\\TestBuffer.txt");
            BufferedWriter out = new BufferedWriter(fos); // Output file
// UTF-8 encoded
            out.write("Hello, Việt Nam");
            out.close();
// Character-based (or text-based) input
            FileReader fis = new FileReader("C:\\abc\\TestBuffer.txt");
            BufferedReader in = new BufferedReader(fis);
            int charRead;
            int charCount = 0;
            while ((charRead = in.read()) != -1) {
                charCount++;
                System.out.printf("%c(%02X) ", (char) charRead, charRead);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
