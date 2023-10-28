class Main {
    public static void main(String[] args) {
        int number = 16;
        System.out.println("Factors of " + number);

        for (int i = 1; i <= number; ++i) {
            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}