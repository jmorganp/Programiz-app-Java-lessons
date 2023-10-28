import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text: ");

        // take entire ine as input

        String data = input.nextLine();

        System.out.println("Input Data: " + data);

        input.close();
    }
}