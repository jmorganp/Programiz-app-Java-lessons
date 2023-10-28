import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // create a hashmap

        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("Initial HashMap: " + students);

        // put() method to add elements
        students.put(1,"Jack");
        students.put(5, "Jill");
        students.put(4, "Millar");
        System.out.println("Updated HashMap: " + students);
    }
}