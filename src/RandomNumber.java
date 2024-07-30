import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(10)+1;
        boolean randomBoolean = random.nextBoolean();
        double randomDouble = random.nextDouble();
        
        System.out.println("Random number: " + randomNumber);
        System.out.println("Random boolean: " + randomBoolean);
        System.out.println("Random double: " + randomDouble);
    }
}