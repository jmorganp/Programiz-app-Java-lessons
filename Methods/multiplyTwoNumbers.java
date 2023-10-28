class Main {
    // method to add numbers
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // method to multiply numbers
    static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int sum, product;

        sum = addNumbers(4, 5);
        System.out.println("Sum: " + sum);

        product = multiplyNumbers(4, 5);
        System.out.println("Product: " + product);
    }
}