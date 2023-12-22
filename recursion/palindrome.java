package recursion;

public class palindrome {
    public static boolean isPalindrome(String str, int start, int end){
        if(start > end){
            return true;
        }
        if(str.charAt(start)==str.charAt(end)){
            return isPalindrome(str, start+1, end-1);
        }else{
            return false;
        }
        

    }
    public static void main(String[] args) {
        String str = "sajjas";
        System.out.println(isPalindrome(str, 0, str.length()-1));
        
    }
}
