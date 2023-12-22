package Extras;

public class SplitArray {
    public static boolean splitArray(int input[]) {
		int[] leftArray = new int[input.length];
        int[] rightArray = new int[input.length];
        int left = 0;
        int right = 0;
        int sumOfLeft = 0;
        int sumOfRight = 0;		

        for (int i = 0; i < input.length; i++) {
            if(input[i] % 5 == 0){
                leftArray[left] = input[i];
                left++;
                sumOfLeft += leftArray[left];
            }
            else if(input[i] % 3 == 0){
                rightArray[right] = input[i];
                right++;
                sumOfRight += rightArray[right];
            }
            else{
                if(sumOfLeft > sumOfRight){
                    rightArray[right] = input[i];
                    right++;
                    sumOfRight += rightArray[right];
                } else{
                    leftArray[left] = input[i];
                    left++;
                    sumOfLeft += leftArray[left];
                }
            }
        }

        if(sumOfLeft == sumOfRight){
            return true;
        }
        return false;
	}
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1,2,3,4}));
        boolean what = splitArray(new int[]{2,3,4,5,2,4,6});
        System.out.println(what);
    }
}
