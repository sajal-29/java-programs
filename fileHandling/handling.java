package fileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class handling {
    public static void main(String[] args) {
//        // InputStreamReader
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//            Scanner sc = new Scanner(System.in);
//            int letters = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        // FileReader
        try(FileReader fr = new FileReader("D://java-DSA-course/fileHandling/notes")){
            int words = fr.read();
            while(fr.ready()){
                System.out.print((char) words);
                words = fr.read();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
