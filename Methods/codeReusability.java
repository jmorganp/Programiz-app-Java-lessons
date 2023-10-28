class Main {
    static double addNumbers(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        double result;
        result = addNumbers(4.5, 9.6);
        System.out.println(result); // 14.1

        result = addNumbers(-15.4, 10.0);
        System.out.println(result); // -5.4
    }
}


/*
 * The main benefit of using a method is code reusability.
 * Once we define a method, we can call it as many times as we want.
 * This makes our code reusable.
 */