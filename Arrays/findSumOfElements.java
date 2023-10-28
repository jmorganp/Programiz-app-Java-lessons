class Main {
    public static void main(String[] args) {
        // create an array of marks
        int[] marks = {35, 42, 56, 62, 67};

        // initialize total marks to 0
        int total = 0;

        // add array elements to total
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        // print total marks
        System.out.println("Total Marks: " + total);
    }
}