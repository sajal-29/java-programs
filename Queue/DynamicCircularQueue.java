package Queue;

import stack.DynamicStack;

public class DynamicCircularQueue extends CircularQueue{
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int n){
        if(this.isFull()){
            int[] data = new int[arr.length *2];

            for (int i = 0; i < arr.length; i++) {
                data[i] = arr[(front + i) % arr.length];
            }
            front = 0;
            end = arr.length;
            arr = data;
        }
        return super.add(n);
    }
}
