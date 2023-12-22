package Queue;


public class stackUsingQueue {
    queue first = new queue();
    queue second = new queue();
    public void add(int x){
        first.add(x);
    }
    public int pop() throws Exception {
        while(!first.isEmpty()){
            second.add(first.remove());
        }
        second.reverse();
        int removed = second.remove();

        while(!second.isEmpty()){
            first.add(second.remove());
        }
        first.reverse();
        return removed;
    }

    public int top() throws Exception {
        return first.front();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        stackUsingQueue st = new stackUsingQueue();
        st.add(34);
        st.add(47);
        st.add(35);
        st.add(74);
        System.out.println(st.top());
        System.out.println(st.pop());
    }
}
