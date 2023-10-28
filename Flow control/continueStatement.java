class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i) {
            // true if i is odd (not divisible by 2)
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}