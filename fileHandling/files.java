package fileHandling;

import java.io.*;

public class files {
    public static void main(String[] args) {
        // creating a new file

        try{
            File fo = new File("D://java-DSA-course/fileHandling/huhu");
            fo.createNewFile();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // writing in a file

        try(FileWriter fw = new FileWriter("D://java-DSA-course/fileHandling/huhu")){
            fw.write("sipping on straight chlorine");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // reading from a file

        try(BufferedReader br = new BufferedReader(new FileReader("D://java-DSA-course/fileHandling/huhu"))){
            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // creating and deleting a file

        try{
            File fo = new File("D://java-DSA-course/fileHandling/lol");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
