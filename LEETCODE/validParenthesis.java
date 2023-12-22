package LEETCODE;

import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
//        System.out.println(isValid("]"));
//        System.out.println(minAddToValid("]"));
        System.out.println(minInsertionsToBalanceParenthesesString("(()))"));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if(ch == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static int minAddToValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
                if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
                if(ch == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
        }
        return stack.size();
    }

    public static int minInsertionsToBalanceParenthesesString(String s){
        Stack<String> stack = new Stack<>();
        int k = 0;
        while (k != s.length()){
            if((s.charAt(k) + "").equals("(")){
                stack.push("(");
                k++;
            } else {
                if(k != s.length()-1 && ("" + s.charAt(k) + s.charAt(k+1)).equals("))")){
                    if(!stack.isEmpty() && stack.peek().equals("(")){
                        stack.pop();
                    } else {
                        stack.push("))");
                    }
                    k+=2;
                }
            }
        }
        int count = 0;

        while(!stack.isEmpty()){

            if(stack.peek() == "("){
                stack.pop();
                count += 2;
            } else if(stack.peek() == "))"){
                stack.pop();
                count += 1;
            }
        }
        return count;
    }
}
