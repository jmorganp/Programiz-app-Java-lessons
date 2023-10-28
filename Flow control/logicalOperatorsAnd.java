class Main {
    public static void main(String[] args) {
        int age = 24, salary = 950;
        boolean result;

        result = (age >= 18 && salary > 600);
        System.out.println(result); // true

        result = (age >= 18 && salary > 1000); // false
    }
}