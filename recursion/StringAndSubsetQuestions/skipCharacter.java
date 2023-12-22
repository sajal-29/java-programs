package recursion.StringAndSubsetQuestions;

public class skipCharacter {
    public static String skip(String str, int i,char c){
        String ans = "";
        if(i==str.length()){
            return ans;
        }
        if(str.charAt(i)==c){
            return skip(str, i+1, c);
        } else{
            ans += str.charAt(i) + skip(str, i+1, c);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skip(str, 0,'c'));
    }
}
