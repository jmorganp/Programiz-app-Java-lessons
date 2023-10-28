class Main {
    public static void main(String[] args) {
        int number1 = 24, number2 = 39;

        // assign number1 to temp
        int temp = number1;

        // assign number 2 to number1
        number1 = number2;

        // assign initial number1 value to number2
        number2 = temp;

        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
    }
}