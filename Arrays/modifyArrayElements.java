class Main {
    public static void main(String[] args) {
        // create an array
        int[] data = {12, 19, 2, 8, 3};

        // change 3rd and 5th elements
        data[2] = 10;
        data[4] = 100;

        // print array elements
        for (int i = 0; i < 5; ++i) {
            System.out.println(data[i]);
        }
    }
}