import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, 5);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("!");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        list2.add(2, "Java");
        System.out.println(list2);
        System.out.println(list2.get(2));
        System.out.println(list2.size());
        list2.clear();
        System.out.println(list2);
        
    }
}