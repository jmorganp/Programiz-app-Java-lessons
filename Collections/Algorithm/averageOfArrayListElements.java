import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        double sum = 0.0, average;
        int length;

        // add elements to ArrayList
        numbers.add(5.6);
        numbers.add(-6.6);
        numbers.add(10.0);
        numbers.add(12.5);

        // number of elements
        length = numbers.size();

        // sum of elements
        for (double number: numbers) {
            sum += number;
        }

        // compute average
        average = sum/length;

        System.out.println("Average: " + average);
    }
}

// Average: 5.375