package recursion.StringAndSubsetQuestions;

import java.util.ArrayList;

public class Subsequences {
    public static void makeSubsequences(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);

        makeSubsequences(str.substring(1), ans+c);
        makeSubsequences(str.substring(1), ans);
    }
    public static ArrayList<String> subsequences(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> l1 = subsequences(str.substring(1), ans+c);
        ArrayList<String> l2 = subsequences(str.substring(1), ans);
        l1.addAll(l2);
        return l1;
        
    }
    public static void main(String[] args) {
        System.out.println(subsequences("abc",""));
    }
}
