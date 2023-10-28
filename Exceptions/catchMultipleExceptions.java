class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            
            // throws ArrayIndexOutOfBoundsException
            array[20] = 30;
        }

        // catch both exceptions
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Output: Index 20 out of bounds for length 10