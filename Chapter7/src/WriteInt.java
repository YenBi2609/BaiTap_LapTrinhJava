import java.io.*;

public class WriteInt {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\WriteInt.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            int i = 100;

            dos.writeInt(i);
            dos.close();

            FileInputStream fis = new FileInputStream("D:\\WriteInt.txt");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("The int number is: " + dis.readInt());

            dis.close();

        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
    }
}
