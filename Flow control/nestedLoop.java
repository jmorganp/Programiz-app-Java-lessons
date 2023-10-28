class Main {
    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <= 2; i++) {
            // inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println();
        }
    }
}