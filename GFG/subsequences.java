package GFG;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class subsequences {
    public static void main(String[] args) {
        System.out.println(powerSet("abc"));
    }
    public static List<String> powerSet(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return findSubsequence(new String(c),"");
    }
    public static List<String> findSubsequence(String str,String ans){
        List<String> list = new ArrayList<>();
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        List<String> l1 = findSubsequence(str.substring(1),ans+c);
        List<String> l2 = findSubsequence(str.substring(1),ans);

        l1.addAll(l2);

        return l1;
    }
}
