class Main {
    public static void main(String[] args) {
        double num1 = 8.3, num2 = 4.98, num3 = -19.2;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }
        else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}