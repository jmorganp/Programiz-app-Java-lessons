class Main {
    static boolean oddEvenCheck(int a) {
        if (a % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 23;
        boolean result = oddEvenCheck(number);
        System.out.println("Is number even? " + result);
    }
}

// Output: Is number even? false