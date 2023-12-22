import java.util.ArrayList;

public class ascii {
    public static void main(String[] args) {
        System.out.println(printAscii("abc", ""));
    }
    public static ArrayList<String> printAscii(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> l1 = printAscii(str.substring(1), ans+c);
        ArrayList<String> l2 = printAscii(str.substring(1), ans);
        ArrayList<String> l3 = printAscii(str.substring(1), ans + (c+0));
        l1.addAll(l2);
        l1.addAll(l3);

        return l1;
    }
}
