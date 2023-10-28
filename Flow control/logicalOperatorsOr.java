class Main {
    public static void main(String[] args) {
        int age = 24, salary = 950;
        boolean result;

        // age >= 18 is true
        // salary > 1000 is false
        result = (age >= 18 || salary > 1000);
        System.out.println(result); // true

        // age >= 30 is false
        // salary > 1000 is also false
        result = (age >= 30 || salary > 1000);
        System.out.println(result); // false
    }
}