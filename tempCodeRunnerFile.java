public class ArrayOfObjects {

    public static void main (String[] args) {
        Food foods[] = new Food[3];
        foods[0] = new Food("Apple");
        foods[1] = new Food("Banana");
        foods[2] = new Food("Cherry");

        // or foods[] = {new Food("Apple"), new Food("Banana"), new Food("Cherry")};

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].name);
        }
    }

}

public class Food {

    String name;
    Food(String name) {
        this.name = name;
    }
}