package Ex9;

import java.io.*;

public class LineCounts {
    public static void main(String[] args) throws IOException{

//        FileWriter fw1 = new FileWriter("file1.txt");
        FileWriter fw2 = new FileWriter("file2.txt");
        FileWriter fw3 = new FileWriter("file3.txt");

//        BufferedWriter bw1 = new BufferedWriter(fw1);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        BufferedWriter bw3 = new BufferedWriter(fw3);

//        bw1.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+"\nbbbbbbbbbbb");
        bw2.write("Xin chao"+"\nQuach"+"\nThi"+"\nYen");
        bw3.write("");

//        if (bw1 != null) {
//                bw1.close();
//            }
        if (bw2 != null) {
                bw2.close();
            }
        if (bw3 != null) {
                bw2.close();
            }
            int count1,count2,count3;
            count1=count2=count3 =0;
try {
    FileReader fr1 = new FileReader("file1.txt");
    BufferedReader lr1 = new BufferedReader(fr1);

    while( lr1.readLine() != null){
        count1++;
    }
    if (lr1 != null) {
        lr1.close();
    }
}catch (IOException e){
    System.err.println("Exception: " + e);
}
finally {
    try {
        FileReader fr2 = new FileReader("file2.txt");
        BufferedReader lr2 = new BufferedReader(fr2);

        while( lr2.readLine() != null){
            count2++;
        }
        if (lr2 != null) {
            lr2.close();
        }
    }catch (IOException e){
        System.err.println("Exception: " + e);
    }
    finally {
        try {
            FileReader fr3 = new FileReader("file3.txt");
            BufferedReader lr3 = new BufferedReader(fr3);

            while( lr3.readLine() != null){
                count3++;
            }
            if (lr3 != null) {
                lr3.close();
            }
        }catch (IOException e){
            System.err.println("Exception: " + e);
        }
    }
}
        System.out.println("Số dòng của file1.txt : " + count1);
        System.out.println("Số dòng của file2.txt : " + count2);
        System.out.println("Số dòng của file3.txt : " + count3);

    }
}
