// example of using logical operators in java

public class LogicalOperators {
    public static void main(String[] args) {
        // write an example of using logical operators in java
        int a = 10; 
        int b = 20;
        int c = 30;
        int d = 40;
        boolean result;
        result = (a > b) && (c > d);
        System.out.println(result);
        result = (a > b) || (c > d);
        System.out.println(result);
        result = !(a > b);
        System.out.println(result);
        
    }
}