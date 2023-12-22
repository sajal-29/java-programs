package Extras;
public class containsTheSecondString {
    static boolean checksequenece(String s , String t) {
        if(t.isEmpty()){
            return true;
        }
        if(s.isEmpty()){
            return false;
        }
        if(s.charAt(0) == t.charAt(0)){
            return checksequenece(s.substring(1), t.substring(1));
        }
        return checksequenece(s.substring(1), t);
        
    }
    public static void main(String[] args) {
        System.out.println(checksequenece("abcde","aeb"));
    }
}
