class Main {
    public static void main(String[] args) {
        int age = 24;
        boolean result;

        result = !(age >= 24);
        System.out.println(result); // false

        result = !(age == 25);
        System.out.println(result); // true
    }
}