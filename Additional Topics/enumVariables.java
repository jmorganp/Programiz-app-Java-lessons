
class Main {
    public static void main(String[] args) {
        enum Size {
            SMALL, MEDIUM, LARGE;
        }
        
        // enum variable
        Size pizzaSize;

        // assign enum constant
        pizzaSize = Size.SMALL;

        System.out.println(pizzaSize);
    }
}