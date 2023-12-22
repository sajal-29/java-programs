package Queue;

public class CircularQueue {
    int[] arr;
    protected int front = 0;
    protected int end = 0;
    private int size = 0;
    public CircularQueue(int n){
        this.arr = new int[n];
    }
    public CircularQueue(){
        this(5);
    }

    public boolean isFull(){
        return size == arr.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean add(int n){
        if(isFull()){
            return false;
        }
        arr[end] = n;
        end++;
        end = end % arr.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue khaali hai bhai");
        }
        int removed = arr[front];
        front++;
        front = front % arr.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Nothing to show, Queue Empty");
        }
        return arr[front];
    }

    public void display(){
        int temp = front;
        do{
            System.out.print(arr[temp] + " -> ");
            temp++;
            temp = temp % arr.length;
        } while(temp != end);
        System.out.print("End");
        System.out.println();
    }

}
