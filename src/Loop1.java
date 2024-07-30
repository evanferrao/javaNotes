import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        scanner.close(); // IMPORTANT: close the scanner

        // do while version of the code
        // do {
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // } while (name.isBlank());


        // we can also use isEmpty() method
        // while (name.isEmpty()) {
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // which one is better among isBlank() and isEmpty()?
        // isBlank() is better because it also checks for whitespace characters
        // isEmpty() only checks for empty string
        // can we use name == "" instead of name.isBlank()?
        // no, we can't use == operator to compare strings
        // == operator compares the references of the strings

        // can we use name.equals("") instead of name.isBlank()?
        // yes, we can use name.equals("") to check if the string is empty
        // but isBlank() is more readable and checks for whitespace characters
    }
}