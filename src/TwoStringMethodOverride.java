public class TwoStringMethodOverride {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.toString());
        System.out.println(myCar);
        // The above two lines are equivalent, because the toString() method is called automatically when an object is printed.
    }

}

class Car {
    String make = "Toyota";
    String model = "Camry";
    String color = "White";
    int year = 2014;

    public String toString() {
        String myString = make + " " + model + " " + color + " " + year;
        return myString;
    }
}