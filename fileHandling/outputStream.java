package fileHandling;

import java.io.*;

public class outputStream {
    public static void main(String[] args) {
        try(OutputStreamWriter osr = new OutputStreamWriter(System.out)){
            osr.write("huehuehue");
            osr.write('\n');
            osr.write(86);
            osr.write(10);
            char[] c = "I am Iron Ma".toCharArray();
            osr.write(c);
            osr.write('n');
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        // writing in file

        try(FileWriter fw = new FileWriter("D://java-DSA-course/fileHandling/notes")){ // To append, write TRUE in the
            fw.write("run away i dare to do ");                                             // constructor
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // appending

        try(FileWriter fw = new FileWriter("D://java-DSA-course/fileHandling/notes", true)){ // To append, write TRUE in the
            fw.write("Seasons change and our love went cold, feed the flame cause we can't let go");                                             // constructor
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // using buffered writer

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D://java-DSA-course/fileHandling/notes", true))){
            bw.newLine();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
