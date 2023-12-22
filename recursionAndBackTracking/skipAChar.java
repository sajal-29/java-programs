public class skipAChar {
    public static void main(String[] args) {
        System.out.println(skipChar("baccad",""));
    }
    public static String skipChar(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        char c = str.charAt(0);
        if(c == 'a'){
            return skipChar(str.substring(1),ans);
        } else {
            return skipChar(str.substring(1), ans+c);
        }
    }
}
