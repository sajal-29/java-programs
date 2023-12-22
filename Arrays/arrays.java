package Arrays;
import java.util.Scanner;
import java.util.*;
public class arrays{
    public static void main(String[] args) {                
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];       
        Arrays.fill(marks,-1); 
        System.out.println(Arrays.toString(marks));
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        for (int i : marks) {
            System.out.println(i);
        }
        sc.close();
    }
}