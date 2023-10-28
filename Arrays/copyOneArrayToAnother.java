class Main {
    public static void main(String[] args) {
        // create an array
        int[] data1 = {1, 3, 5, 7};

        // copy data1 array to another array
        int[] data2 = data1;

        // print data2
        System.out.print("data2 = ");

        for (int data: data2) {
            System.out.print(data + ", ");
        }
    }
}

// Output: data2 = 1, 3, 5, 7,