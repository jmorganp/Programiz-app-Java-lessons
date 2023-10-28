class Main {
    // create a mthod
    static int addNumbers(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    // the main() method
    public static void main(String[] args) {
        int result;
        result = addNumbers(4, 9);
        System.out.println(result); // 13
    }
}