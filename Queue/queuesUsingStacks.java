package Queue;
import stack.stack;
import java.util.Stack;

public class queuesUsingStacks {
    stack first = new stack(10);
    stack second = new stack(10);

    public queuesUsingStacks(){}

    public void add(int n){
        first.push(n);
    }
    public int remove() throws Exception{
        if(first.isEmpty()){
            throw new Exception("Stack Empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

}
