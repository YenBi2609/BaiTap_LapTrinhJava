package Pipe;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.Scanner;

public class pWriter extends Thread{
    PipedWriter writer;

    pWriter(PipedWriter writer) {
        this.writer = writer;
    }
    public void run() {

        String str;

        while (true) {

            Scanner in = new Scanner(System.in);

            str = in.nextLine();

            try {

                writer.write(str);

            } catch (IOException e) {

// TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

    }
}
