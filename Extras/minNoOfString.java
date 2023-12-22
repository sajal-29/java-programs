package Extras;

public class minNoOfString {
    public static String minLen(String str){
        int startInd = 0;
        int endInd = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                min = Math.min(min, count);
                count = 0;
            }
            else{
                count++;
            }
        }
        min = Math.min(min, count);
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                startInd = i;
                count++;
            }
            if(str.charAt(i) == ' '|| i == str.length()-1){
                if(count == min){
                    endInd = i;
                    break;
                }
                else{
                    count = 0;
                }
            }
        }
        return str.substring(startInd-min+1, endInd+1);
    }
        
    
    public static void main(String[] args) {
        String str = "hello Jain I am sajal jain";
        System.out.println(minLen(str));

    }   
}
