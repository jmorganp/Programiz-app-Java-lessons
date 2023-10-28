class Main {
    public static void main(String[] args) {
        int num = 8;
        int factorial = 1;

        if (num < 0) {
            System.out.println("Error!");
        }
        else {
            for (int i = 1; i <= num; ++i) {
                factorial *= i;
            }
        }

        System.out.printf("Factorial of " + num + " is " + factorial);
    }
}