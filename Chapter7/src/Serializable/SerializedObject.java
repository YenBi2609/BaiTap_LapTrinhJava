package Serializable;

import java.io.Serializable;

public class SerializedObject implements Serializable {
    private int number;

    public SerializedObject(int number) {

        this.number = number;

    }

    public int getNumber() {

        return number;

    }
}
