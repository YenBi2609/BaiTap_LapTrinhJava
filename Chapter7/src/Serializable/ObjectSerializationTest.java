package Serializable;

import java.io.*;

public class ObjectSerializationTest {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        ObjectOutputStream out = null;

        try {

            out = new ObjectOutputStream(new BufferedOutputStream(

                    new FileOutputStream("C:\\abc\\object.dat")));

// Create an array of 10 SerializedObjects with ascending numbers

            SerializedObject[] objs = new SerializedObject[10];

            for (int i = 0; i < objs.length; i++) {

                objs[i] = new SerializedObject(i);

            }

// Write the 10 objects to file, one by one.

            for (int i = 0; i < objs.length; i++) {

                out.writeObject(objs[i]);

            }

// Write the entire array in one go.

            out.writeObject(objs);

            out.close();

            in = new ObjectInputStream(new BufferedInputStream(

                    new FileInputStream("C:\\abc\\object.dat")));

// Read back the objects, cast back to its original type.

            SerializedObject objIn;

            for (int i = 0; i < objs.length; i++) {

                objIn = (SerializedObject)in.readObject();

                System.out.println(objIn.getNumber());

            }

            SerializedObject[] objArrayIn;

            objArrayIn = (SerializedObject[])in.readObject();

            for (SerializedObject o : objArrayIn) {

                System.out.println(o.getNumber());

            }

            in.close();

        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
