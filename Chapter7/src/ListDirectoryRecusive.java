import java.io.File;

public class ListDirectoryRecusive {
    public static void listRecursive(File dir) {

        if (dir.isDirectory()) {

            File[] items = dir.listFiles();
            if (items != null) {

                for (File item : items) {

                    System.out.println(item.getAbsoluteFile());

                    if (item.isDirectory())
                        listRecursive(item);

                }
            }
        }
    }
    public static void main (String[] args){

            File dir = new File("C:\\Windows");
            listRecursive(dir);
    }
}