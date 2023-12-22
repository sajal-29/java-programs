import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        System.out.println(findSubsequences("abc", ""));
    }
//    public static void findSubsequences(String str, String ans){
//        if(str.isEmpty()){
//            System.out.print(ans+" ");
//            return;
//        }
//        char c = str.charAt(0);
//        findSubsequences(str.substring(1), ans+c);
//        findSubsequences(str.substring(1), ans);
//    }
    public static ArrayList<String> findSubsequences(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> l1 = findSubsequences(str.substring(1), ans+c);
        ArrayList<String> l2 = findSubsequences(str.substring(1), ans);
        l1.addAll(l2);

        return l1;
    }

}
