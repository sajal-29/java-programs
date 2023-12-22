package stack;

public class Main {
    public static void main(String[] args) throws Exception{
        stack st = new stack(5);

        st.push(5);
        st.push(68);
        st.push(25);
        st.push(85);
        st.push(75);
        st.push(234);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        DynamicStack stack = new DynamicStack(5);

        stack.push(32);
        stack.push(84);
        stack.push(46);
        stack.push(95);
        stack.push(47);
        stack.push(634);
        stack.push(35);



    }
}
