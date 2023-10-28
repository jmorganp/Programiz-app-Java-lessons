class Main {
    public static void main(String[] args) {
        double num1 = 10.00, num2 = 10.99;

        // convert to int type
        int data1 = (int) num1;
        int data2 = (int) num2;

        System.out.println(data1); // 10
        System.out.println(data2); // 10

        // In narrowing type casting, there may be loss in data
        // because we are converting larger size type to smaller size type.
        // Hence, narrowing casting must be done manually.
    }
}