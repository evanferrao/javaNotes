import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pancakes");
        bakeryList.add("Waffles");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Apples");
        produceList.add("Bananas");
        produceList.add("Oranges");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Coffee");
        drinksList.add("Tea");
        drinksList.add("Milk");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList);

    }
}