package BigDataHandeling;
import java.util.Random;

public class stringBuffer {
    public static void main(String[] args) {
        //constructor 1 : default constructor
        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity());

        // constructor 2 : initializing a string
        StringBuffer s2 = new StringBuffer("yolo");

        // constructor 3 : initializing with a capacity
        StringBuffer s3 = new StringBuffer(1);

        s.append("loda");
        s.insert(3, "good");
        s.replace(1,4, "teri maa da phoda");
        s.delete(4,7);
        s.reverse();
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s3.capacity());
        System.out.println(generateRandomString(10));
    }
    public static String generateRandomString(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sb.append((char)(97 + (int)(random.nextFloat() * 26)));
        }

        return sb.toString();
    }
}
