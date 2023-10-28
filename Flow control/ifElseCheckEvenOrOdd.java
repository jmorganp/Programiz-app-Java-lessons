class Main {
    public static void main(String[] args) {
        int number = 15;

        // check if number is perfectly
        // divisible by 2 or not
        if (number % 2 == 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Odd Numbers");
        }

        // More on if Statement

        // if the body of 'if' has only one statement,
        // it's not necessary to use curly brackets {}. e.g.

        if (number > 0) System.out.println("Positive Number");
        else System.out.println("Negative Number");
    }
}