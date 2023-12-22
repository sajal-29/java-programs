package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        System.out.println(exist(board, "abcce"));
    }
    public static boolean exist(char[][] board, String word) {
        List<List<String>> list = new ArrayList<>();
        String ans = "";
        List<String> l = new ArrayList<>();
        l.add(word);
        check(board, 0, 0, list, ans);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(l)){
                return true;
            }
        }
        return false;
    }

    private static void check(char[][] board, int row, int col, List<List<String>> list, String ans) {
        if(row == board.length -1 && col == board[0].length -1){
            List<String> l = new ArrayList<>();
            l.add(ans);
            list.add(new ArrayList<>(l));
            return;
        }

        if(col < board[0].length - 1){
            check(board, row, col+1, list, ans + board[row][col]);
        }
        if(row < board.length - 1){
            check(board, row+1, col,list,ans + board[row][col]);
        }

    }
}
