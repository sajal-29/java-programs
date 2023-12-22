package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args) {
        // using InputStreamReader
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("typed: "+br.readLine());
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        // using BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader("D://java-DSA-course/fileHandling/notes"))){
            while(br.ready()){
                System.out.print(br.readLine());
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
