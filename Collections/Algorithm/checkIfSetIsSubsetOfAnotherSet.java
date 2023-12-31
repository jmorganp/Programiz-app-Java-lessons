import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        
        // create a HashSet
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        System.out.println("Set1: " + numbers);

        // create another HashSet
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("Set2: " + primeNumbers);

        // check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);

        if (result) {
            System.out.println("Set2 is a subset of Set1");
        }
        else {
            System.out.println("Set2 is not a subset of Set1");
        }
    }
}