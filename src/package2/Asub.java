package package2;

// import A from package1
import package1.*;

public class Asub extends A{
    public static void main (String args[]) {
        Asub asub = new Asub();
        System.out.println(asub.publicMessage);
    }
}
