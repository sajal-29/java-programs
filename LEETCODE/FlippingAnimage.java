package LEETCODE;

public class FlippingAnimage {
    public static int[][] flipAndInvertImage(int[][] image){
        int k = image.length-1;
        for (int i = 0; i < image[0].length; i++) {
            for (int j = 0; j < image.length/2; j++) {
                swap(image,i,j,k);
                k--;
            }
            for (int j = 0; j < image.length; j++) {
                image[i][j] ^= 1;
            }
            k = image.length-1;
        }
        // for (int i = 0; i < image[0].length; i++) {
        //     for (int j = 0; j < image.length; j++) {
        //         if(image[i][j] == 0){
        //             image[i][j] = 1;
        //         }
        //         else if(image[i][j] == 1){
        //             image[i][j] = 0;
        //         }
        //     }
        // }
        return image;
    }
    private static void swap(int[][] image, int i, int j, int k) {
        int temp = image[i][j];
        image[i][j] = image[i][k];
        image[i][k] = temp;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] changed = flipAndInvertImage(arr);
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(changed[i][j]+" ");
            }
            System.out.println();
        }
    }
}
