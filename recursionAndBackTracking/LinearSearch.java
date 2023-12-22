import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,23,5,7,64,386,738,9,765};
        int[] nums = {343,6,875,4,3,56,85,7,22,6,7};
        System.out.println(linearSearch(arr, 6424, 0));
        System.out.println(reverseLinearSearch(arr, 7, arr.length-1));
        System.out.println(LSonMultipleOccurrences(nums, 6, 0, new ArrayList<>()));
        System.out.println(LSwithoutArraylist(nums, 7, 0));
    }
    public static int linearSearch(int[] arr, int target, int start){
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        return linearSearch(arr, target, start+1);
    }
    public static int reverseLinearSearch(int[] nums, int target, int end){
        if(end == -1){
            return -1;
        }
        if(nums[end] == target){
            return end;
        }
        return reverseLinearSearch(nums, target, end - 1);
    }
    public static ArrayList<Integer> LSonMultipleOccurrences(int[] arr, int target, int start, ArrayList<Integer> list){
        if(start == arr.length){
            return list;
        }
        if(arr[start] == target){
            list.add(start);
        }
        return LSonMultipleOccurrences(arr, target, start+1, list);
    }
    public static ArrayList<Integer> LSwithoutArraylist(int[] arr, int target, int start){
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }
        if(arr[start] == target){
            list.add(start);
        }
        ArrayList<Integer> l1 = LSwithoutArraylist(arr, target, start+1);
        list.addAll(l1);
        return list;
    }
}
