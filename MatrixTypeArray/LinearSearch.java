package MatrixTypeArray;
public class LinearSearch {
    public static void searchLinear(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    System.out.println(i+","+j);
                    return;
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        int[][] arr = {{12,13,34,23},{23,23,64,33},{65,35,93,42}};
        searchLinear(arr,93);
    }
}
