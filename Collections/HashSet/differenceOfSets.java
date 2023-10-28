import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Set1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Set2: " + oddNumbers);

        // Differenc between HashSet1 and HashSet2

        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference: " + primeNumbers);
    }
}