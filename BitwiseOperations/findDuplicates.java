package BitwiseOperations;

public class findDuplicates {
    public static void main(String[] args) {
        System.out.println(findDup(new int[] {2,3,2,4,6,4,3}));
    }
    public static int findDup(int[] arr){
        int unique = 0;
        for (int i : arr) {
            unique ^= i;
        }
        return unique;
    }
}
