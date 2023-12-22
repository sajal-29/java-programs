package LEETCODE;

public class smallestLetter {
    public static char nextGreatesLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }  
            
        }
        return letters[(start)%letters.length];
    }
    public static void main(String[] args) {
        char[] ch = {'e','e','g','g'};
        System.out.println(nextGreatesLetter(ch, 'g'));
    }
}
