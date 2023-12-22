package Queue;
import java.util.Arrays;

public class queue {
    int ptr = 0;
    protected int[] arr;

    public queue(){
        this(10);
    }
    public queue(int n){
         this.arr = new int[n];
    }

    public boolean isFull(){
        return ptr == arr.length;
    }

    public boolean isEmpty(){
        return ptr == 0;
    }

    public boolean add(int n){
        if(isFull()){
            return false;
        }
        arr[ptr] = n;
        ptr++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = arr[0];

        for (int i = 1; i < ptr; i++) {
            arr[i-1] = arr[i];
        }
        ptr--;
        return removed;
    }

    public void reverse(){
        int temp = ptr;
        int k = 0;
        int[] data = new int[arr.length];

        for (int i = temp-1; i >= 0; i--) {
            data[k] = arr[i];
            k++;
        }
        arr = data;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return arr[ptr-1];
    }

    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(arr[i] + " <- ");
        }
        System.out.print("End");
        System.out.println();
    }
}
