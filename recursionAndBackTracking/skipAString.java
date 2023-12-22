public class skipAString {
    public static void main(String[] args) {
        System.out.println(skipString("HI I'M Sajal", "HI"));
    }
    public static String skipString(String str, String target){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(target)){
            return skipString(str.substring(target.length()), target);
        } else {
            return str.charAt(0) + skipString(str.substring(1), target);
        }
    }
}
