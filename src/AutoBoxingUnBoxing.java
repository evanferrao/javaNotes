// write code in java explaining auto boxing and unboxing
// Auto boxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

public class AutoBoxingUnBoxing{
    public static void main(String[] args) {
        // Auto boxing
        Integer i = 10;
        System.out.println(i);
        // how is auto boxing done?
        // Integer i = Integer.valueOf(10);
        // System.out.println(i);

        // Unboxing
        int j = i;
        System.out.println(j);
        // what is happending here?
        // answer: the Integer object i is being converted to an int primitive type
    }
}