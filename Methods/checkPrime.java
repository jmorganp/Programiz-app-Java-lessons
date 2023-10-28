class Main {
    // method to check prime number

    static boolean checkPrime(int number) {
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result1 = checkPrime(31);

        if (result1) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Non-prime Number");
        }
    }
}