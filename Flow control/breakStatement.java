class Main {
    public static void main(String[] args) {
        // loop should run 10 times

        for (int i = 0; i < 10; ++i) {
            // however, loop breaks when i is 4

            if (i == 4) {
                break;
            }

            System.out.println(i);
        }
    }
}