class Main {
    // create a generics method
    public <T> void display (T data) {
        System.out.println("Generics Method");
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // generics method working with String
        obj.<String>display("Java");

        // generics method working with Integer
        obj.<Integer>display(25);
    }
}