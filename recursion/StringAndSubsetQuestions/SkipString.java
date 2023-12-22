package recursion.StringAndSubsetQuestions;

public class SkipString {
    public static String skipString(String str,String target){
        String ans = "";
        if(str.isEmpty()){
            return ans;
        }
        if(str.startsWith(target,0)){
            return skipString(str.substring(target.length()), target);
        }
        else{
            ans = str.charAt(0) + skipString(str.substring(1),target);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str2 = "Anappleadaykeepsadoctoraway";
        System.out.println(skipString(str2, "app"));
    }
}
