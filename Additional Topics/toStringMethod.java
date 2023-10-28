
class Main {
    
    enum Size {
        SMALL, MEDIUM, LARGE
    }
    public static void main(String[] args) {
        String pizzaSize;

        // string representation
        pizzaSize = Size.MEDIUM.toString();

        System.out.println(pizzaSize);

    }
}