class Main {
    public static void main(String[] args) {
        // create an array of marks
        int[] marks = {77, 74, 81, 69, 83};

        // initialize total marks to 0
        int total = 0;

        // add array elements to total
        for (int mark: marks) {
            total = total + mark;
        }

        int size = marks.length;

        // compute average
        double average = total / size;
        System.out.println("Average Marks: " + average);
    }
}