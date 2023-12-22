package stack;

public class DynamicStack extends stack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int n){
        if(this.isFull()){
            int[] temp = new int[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        return super.push(n);
    }
}
