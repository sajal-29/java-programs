package LEETCODE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class CombinationSum {
    public static void main(String[] args) {
        int[] num = {2,3,6,7};
        System.out.println(combinationSum(num, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), candidates,0, target);
        System.out.println(list.get(list.size() - 1));
        return list;
    }
    public static void helper(List<List<Integer>> list, List<Integer> l, int[] num,int start ,int target){
        if(target < 0){
            return;
        }
        else if(target == 0){
            List<Integer> newList = new ArrayList<>(l);
            Collections.sort(newList);
            if(list.isEmpty()){
                list.add(new ArrayList<>(l));
            }
           else if(!list.get(list.size() - 1).equals(newList)){
               list.add(new ArrayList<>(l));
           }
        }
        else {
            for (int i = start; i < num.length; i++) {
                l.add(num[i]);
                helper(list, l, num, start, target - num[i]);
                l.remove(l.size() - 1);
            }
        }



    }

}
