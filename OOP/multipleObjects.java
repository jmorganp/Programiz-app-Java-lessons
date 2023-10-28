class Bicycle {
    // field
    int gear = 5;

    // method
    // void applyBrake() {
    //     System.out.println("Applying brake.");
    // }

    public static void main(String[] args) {
        // create object of Bicycle
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // access fields using both objects
        System.out.println(bike1.gear); // 5
        System.out.println(bike2.gear); // 5


        // change value of gear
        bike1.gear = 6;
        bike2.gear = 4;

        // print new values
        System.out.println(bike1.gear); // 6
        System.out.println(bike2.gear); // 4
    }
}