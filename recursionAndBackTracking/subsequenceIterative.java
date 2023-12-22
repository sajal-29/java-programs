import java.util.ArrayList;
import java.util.List;

public class subsequenceIterative {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> list = subsequence(arr);
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> subsequence(int[] arr){
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        for (int i: arr) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                List<Integer> left = new ArrayList<>(list.get(j));
                left.add(i);
                if(!list.contains(left)){
                    list.add(left);
                }
            }
        }
        return list;
    }
}
