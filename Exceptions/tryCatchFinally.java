class Main {
    public static void main(String[] args) {
        
        // create an array
        int[] arr = {1, 2, 3};

        try {
            // print array elements
            System.out.println("Array elements: ");
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        }

        catch (Exception e) {
            System.out.println("Inside catch: ");

            // print the exception message
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally: Always executed");
        }
    }
}