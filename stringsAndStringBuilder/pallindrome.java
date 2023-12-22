package stringsAndStringBuilder;

public class pallindrome {
    public static boolean isPalindrome(String str){
        if(str == null){
            return true;
        }
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
}
