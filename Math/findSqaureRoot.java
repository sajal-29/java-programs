package Math;

public class findSqaureRoot {
    //Problem : find square root of a number using binary search 
    public static int SquareRootOf(int n){
        for (int i = 2; i*i <= n; i++) {
            if(i*i == n){
                return i;
            }
        }
        return -1;
    }
    // Using binary Search

    public static double findSquareRootUsingBS(int target, int p){
        long start = 1;
        long end = target;
        double root = 0.0;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == target){
                return mid;
            }
            else if(mid*mid > target){
                end = mid-1;
            }
            else if(mid*mid < target){
                start = mid+1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= target){
                root += increment;
            }
            root -= increment;
            increment/=10;
        }
        return root;
    }
    public static void main(String[] args) {
        int precision = 3;
        System.out.println(SquareRootOf(289));
        System.out.println(findSquareRootUsingBS(70,precision));
    }
}
