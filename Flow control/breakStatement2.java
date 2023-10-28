class Main {
    public static void main(String[] args) {
        int number = 51;

        while (true) {
            if (number % 7 == 0) {
                break;
            }

            ++number;
        }

        System.out.println(number);
    }
}