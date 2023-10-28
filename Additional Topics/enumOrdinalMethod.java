
class Main {
    enum Size {
        SMALL, MEDIUM, LARGE
    }
    
    public static void main(String[] args) {
        
        // returns the position of constants
        System.out.println(Size.SMALL.ordinal());  // 0
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.ordinal());
    }
}