package Math;

public class newtonRaphsonMethod {
    public static double NewtonMethod(double n){
        double root;
        double x = n;   //Assigning the value of x as the number of which we have to find the root
        while(true){
            root = (x + (n/x))/2;   //Newton's Formula
            if(Math.abs(root - x) < 0.5){   //Error detection/precision
                break;
            }
            x = root;   //If the condition is not fulfilled the loop is again ran but with 
                        //the updated value of x;
        }
        return root;
    } 
    public static void main(String[] args) {
        System.out.println(NewtonMethod(40));
    }
}
 