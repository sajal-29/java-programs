package BitwiseOperations;

public class FindSingleDigit {
    // Problem: Find that number which is appearing once in an array
    public static int findItem(int[] arr,int n){
        int sum = 0;
        int count = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i <= (int)Math.sqrt(max)+1; i++) {
            int mask = 1 << i;
            for (int j = 0; j < arr.length; j++) {
                if((arr[j]&mask) == mask){
                    sum++;
                }
            }
            count = (int)(count + sum * Math.pow(10, i));
            sum=0;
        }
        return (count%n)+1;
    }
    public static void main(String[] args) {
        int howManyTimesAppearing = 3;
        System.out.println(findItem(new int[]{2,5,2,2,7,8,8,7,8,7},howManyTimesAppearing));
    }
}
// INCOMPLETE CODE
