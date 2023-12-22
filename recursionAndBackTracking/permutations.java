import java.lang.reflect.Array;
import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.println(permute("abcd",""));
        System.out.println(permuteCount("abcd",""));

    }
    public static ArrayList<String> permute(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> l = new ArrayList<>();
        char c = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            ArrayList<String> help = permute(str.substring(1),first + c + second);
            l.addAll(help);
        }
        return l;
    }
    public static int permuteCount(String str, String ans){
        if(str.isEmpty()){
            return 1;
        }
        int count = 0;
        char c = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0,i);
            String second = ans.substring(i);
            count += permuteCount(str.substring(1),first + c + second);
        }
        return count;
    }
}
