class Main {
    enum Size {
        SMALL, MEDIUM, LARGE
    }
    public static void main(String[] args) {
        
        // get enum constatns in an array
        Size[] constants = Size.values();

        System.out.println("Array Elements:");
        
        for (Size constant : constants) {
            System.out.println(constant);
        }
    }
}