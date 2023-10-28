// Division program
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        int numerator, denominator;
        double result;

        // take inputs
        System.out.println("Enter numerator and denominator:");
        Scanner input = new Scanner(System.in);

        numerator = input.nextInt();
        denominator = input.nextInt();

        // code that may generate exception

        try {
            result = numerator / denominator;
            System.out.println("result: " + result);
        }
        // if exception occurs, this code is executed
        catch (Exception e) {
            System.out.println("Denominator cannot be 0.");
            System.out.println("Exception: " + e);
        }
    }
}