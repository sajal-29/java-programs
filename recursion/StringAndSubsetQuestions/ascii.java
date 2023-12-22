package recursion.StringAndSubsetQuestions;

import java.util.ArrayList;

public class ascii {
    public static void printAscii(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);

        // printAscii(str.substring(1), ans+c);
        // printAscii(str.substring(1), ans);
        printAscii(str.substring(1),ans + (c + 0));
        printAscii(str.substring(1),ans+0);
    }
    public static ArrayList<String> subsequencesAscii(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> l1 = subsequencesAscii(str.substring(1), ans+(c+0));
        ArrayList<String> l2 = subsequencesAscii(str.substring(1), (ans+0));
        l1.addAll(l2);
        return l1;
        
    }
    public static void main(String[] args) {
        printAscii("ab","");
        System.out.println(subsequencesAscii("ab",""));
    }
}
