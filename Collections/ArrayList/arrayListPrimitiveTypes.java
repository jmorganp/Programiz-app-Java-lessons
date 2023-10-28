import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // create an ArrayList of Integer type

        ArrayList<Integer> languages = new ArrayList<>();

        // add elements
        languages.add(5);
        languages.add(10);
        languages.add(15);

        System.out.println("ArrayList: " + languages);
    }
}

/*
 * Note:
 * We cannot create an ArrayList of primitive types such as int, double, char etc.
 * 
 * However, we can use the corresponding wrapper classes such as: Integer, Double, Character etc. for primitive data types.
 */