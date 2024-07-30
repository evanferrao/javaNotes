public class ForEachEnhancedFor {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        String names[] = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}