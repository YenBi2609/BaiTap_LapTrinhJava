import java.io.*;

public class UnicodeFileIO {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\abc\\TestUTF8.txt");
            Writer out = new OutputStreamWriter(fos, "UTF8"); // Output file
// UTF-8 encoded
            out.write("Hello, Việt Nam");
            out.close();
// Character-based (or text-based) input
            FileInputStream fis = new FileInputStream("C:\\abc\\TestUTF8.txt");
            Reader in = new InputStreamReader(fis, "UTF8");
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
