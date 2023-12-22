package Trees;

import java.util.*;
import java.util.ArrayList;
import java.util.Queue;

public class Questions {

    // BFS or Level-Order-Traversal
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> ans = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                TreeNode current = q.remove();
                ans.add(current.val);
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
            list.add(ans);
        }
        return list;
    }

    // Q2 : Average of levels in Binary Tree

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        double sum = 0.0;
        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            for (int i = 0; i < level; i++) {
                TreeNode current = q.remove();
                sum += current.val;
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
            ans.add(sum/level);
        }
        return ans;
    }

    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current.left != null){
                q.offer(current.left);
            }
            if(current.right != null){
                q.offer(current.right);
            }
            if(current.val == key){
                break;
            }
        }
        return q.peek();
    }

    // Q4 zig-zag level order traversal

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> d = new LinkedList<>();
        d.add(root);
        boolean normal = false;
        while(!d.isEmpty()){
            int level = d.size();
            List<Integer> ans = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                if(!normal){
                    TreeNode current = d.removeFirst();
                    ans.add(current.val);
                    if(current.left != null){
                        d.addLast(current.left);
                    }
                    if(current.right != null){
                        d.addLast(current.right);
                    }
                }
                if(normal){
                    TreeNode current = d.removeLast();
                    ans.add(current.val);
                    if(current.right != null){
                        d.addFirst(current.right);
                    }
                    if(current.left != null){
                        d.addFirst(current.left);
                    }
                }
                normal = !normal;
            }
            list.add(ans);
        }
        return list;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
