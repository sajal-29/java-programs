package stringsAndStringBuilder;

public class strings {
    public static void main(String[] args) {
        //for checking immutability of strings in java
        String a = "Sajal";
        String b = "Sajal";
        //Both a and b pointing to the same value
        a = "jain";
        System.out.println(a+" "+b);

        //for comparing strings
        System.out.println(a==b);

        //Creating two different references to the same value
        String c = new String("sajal");
        String d = new String("sajal");
        System.out.println(c==d);

        //PrintStream class
        //printing a wrapper class
    }
}
