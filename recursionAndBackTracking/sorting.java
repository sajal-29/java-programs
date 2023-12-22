public class sorting {
    public static void main(String[] args) {
        int[] arr = {4,10,16,25,2,14};
//        bubbleSort(arr, 0, arr.length-1);
        selectionSort(arr, 0, arr.length-1, 0);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    public static void bubbleSort(int[] arr, int i, int end){
        if(end == -1 || i == arr.length-1){
            return;
        }
        if(arr[i] > arr[i+1]){
            swap(arr, i, i+1);
        }
        bubbleSort(arr, i+1, end);
        bubbleSort(arr, 0, end - 1);
    }

    public static void selectionSort(int[] arr, int i, int end, int maxInd){
        if(end == -1){
            return;
        }
        if(i <= end){
            if(arr[i] > arr[maxInd]){
                selectionSort(arr, i+1, end, i);

            } else {
                selectionSort(arr, i+1, end, maxInd);
            }
        } else {
            swap(arr, end, maxInd);
            selectionSort(arr, 0, end-1,0);
        }
    }
    private static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
