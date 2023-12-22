package recursion.StringAndSubsetQuestions;
import java.util.*;

public class subsequenceIterative {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsequence(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsequence(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal)){
                    outer.add(internal);
                }
            }            
        }

        return outer;
    }
}
