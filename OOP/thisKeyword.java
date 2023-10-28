class Main {
    int a;

    Main(int a) {
        this.a = a;

        // print this keyword
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        // call the constructor
        Main obj = new Main(8);

        // print the object
        System.out.println("object reference = " + obj);
    }
}