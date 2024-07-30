public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0, 5));
        System.out.println(str.indexOf("World"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.trim());
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World!"));
        System.out.println(str.contains("Hello"));
        System.out.println(str.equals("Hello, World!"));
        System.out.println(str.equalsIgnoreCase("hello, world!"));
        System.out.println(str.compareTo("Hello, World!")); 
        System.out.println(str.compareToIgnoreCase("hello, world!"));
        System.out.println(str.toCharArray());
        System.out.println(str.toCharArray().length);
        System.out.println(str.getBytes());
        System.out.println(str.getBytes().length);
        System.out.println(str.concat(" Goodbye!"));
        System.out.println(str.concat(" Goodbye!").length());
        System.out.println(str.concat(" Goodbye!").getBytes());
        System.out.println(str.concat(" Goodbye!").getBytes().length);
        System.out.println(str.concat(" Goodbye!").toCharArray());
        System.out.println(str.concat(" Goodbye!").toCharArray().length);
        System.out.println(str.concat(" Goodbye!").toUpperCase());
        System.out.println(str.concat(" Goodbye!").toUpperCase().length());
        System.out.println(str.concat(" Goodbye!").toLowerCase());
        System.out.println(str.concat(" Goodbye!").toLowerCase().length());
        System.out.println(str.concat(" Goodbye!").replace("Goodbye", "Java"));
        System.out.println(str.concat(" Goodbye!").replace("Goodbye", "Java").length());
        System.out.println(str.concat(" Goodbye!").trim());
        System.out.println(str.concat(" Goodbye!").trim().length());
        System.out.println(str.concat(" Goodbye!").startsWith("Hello"));
        

    }
}