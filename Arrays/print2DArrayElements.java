class Main {
    public static void main(String[] args) {
        int[][] data = {
            {2, 3},
            {7, 14},
            {1, 3, 5}
        };

        for ( int [] inner: data) {
            for (int value: inner) {
                System.out.println(value);
            }
        }
    }
}

/*
 * It's also common to use 2D arrays as matrices e.g.
 * int[][] data = {
 *  {2, 3, 5},
 *  {4, 8, 12}
 * };
 */