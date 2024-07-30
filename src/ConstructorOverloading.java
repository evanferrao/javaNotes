public class ConstructorOverloading {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Thin", "Tomato", "Mozzarella", "Olives");
        System.out.printf("Here are the ingredients of your pizza \n");
        System.out.printf("Bread: %s\n", pizza1.bread);
        System.out.printf("Sauce: %s\n", pizza1.sauce);
        System.out.printf("Cheese: %s\n", pizza1.cheese);
        System.out.printf("Topping: %s\n", pizza1.topping);
                
        Pizza pizza2 = new Pizza("Thick", "Tomato", "Mozzarella");
        System.out.printf("Here are the ingredients of your pizza \n");
        System.out.printf("Bread: %s\n", pizza2.bread);
        System.out.printf("Sauce: %s\n", pizza2.sauce);
        System.out.printf("Cheese: %s\n", pizza2.cheese);

        Pizza pizza3 = new Pizza("Thin", "Tomato");
        System.out.printf("Here are the ingredients of your pizza \n");
        System.out.printf("Bread: %s\n", pizza3.bread);
        System.out.printf("Sauce: %s\n", pizza3.sauce);
        
        Pizza pizza4 = new Pizza("Thick");
        System.out.printf("Here are the ingredients of your pizza \n");
        System.out.printf("Bread: %s\n", pizza4.bread);

        Pizza pizza5 = new Pizza();
        System.out.printf("Here are the ingredients of your pizza \n");
        System.out.printf("Bread: %s\n", pizza5.bread);
        
    }
}

class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    };

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    };

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    };

    Pizza(String bread) {
        this.bread = bread;
    };

    Pizza() {
    };

}