package recursion.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {
    public static int search(int[] arr, int start, int target){
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        return search(arr, start+1, target);
    }
    public static void multipleSearch(int[] arr, int start, int target,ArrayList<Integer> ll){
        if(start == arr.length){
            return;
        }
        if(arr[start]==target){
            ll.add(start);
        }
        multipleSearch(arr, start+1, target, ll);
    }
    public static ArrayList<Integer> searching(int[] arr, int start, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }
        if(arr[start]==target){
            list.add(start);
        }
        ArrayList<Integer> finalList = searching(arr, start+1, target);

        list.addAll(finalList);

        return list;
        
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{34,5,764,32,5,6,9,0,452,779}, 0,46));
        ArrayList<Integer> list = new ArrayList<>();
        multipleSearch(new int[]{2,3,24,567,9,64,2,6,9,9}, 0, 9, list);
        System.out.println(list);
        System.out.println(searching(new int[]{326,3,3,5,8,3,7,56}, 0, 3));
    }
}
