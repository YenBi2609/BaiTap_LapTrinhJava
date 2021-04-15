package Pipe;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class test {
    public static void main(String[] args) throws IOException {
        // Create a new instance of a PipedReader object.

        PipedReader reader = new PipedReader();

// Create a new instance of a PipedWriter object.

        PipedWriter writer = new PipedWriter();

// Connect the PipedReader to a PipedWriter object.

        reader.connect(writer);

        pReader treader = new pReader(reader);

        pWriter twriter = new pWriter(writer);

        treader.start();

        twriter.start();
    }
}
