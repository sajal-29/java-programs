package permutations;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abcx";
        permutation(str, "");
        System.out.println(permutationWithList(str, ""));
        System.out.println(countPermutations(str, ""));
    }
    public static void permutation(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        for (int i = 0;i <= ans.length(); i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            permutation(str.substring(1),f+c+s);
        }
    }
    public static ArrayList<String> permutationWithList(String str, String ans){
        ArrayList<String> ll1 = new ArrayList<>();
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        for (int i = 0;i <= ans.length(); i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            ArrayList<String> ll = permutationWithList(str.substring(1),f+c+s);
            ll1.addAll(ll);
        }
        return ll1;
    }
    public static int countPermutations(String str, String ans){
        int count = 0;
        if(str.isEmpty()){
            return 1;
        }
        char c = str.charAt(0);
        for (int i = 0;i <= ans.length(); i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            int counter = countPermutations(str.substring(1),f+c+s);
            count += counter;
        }
        return count;
    }
}
