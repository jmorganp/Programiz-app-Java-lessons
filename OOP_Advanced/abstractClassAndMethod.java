abstract class Polygon {
    // abstract method
    abstract void getArea();

    // regular method
    void printSides(int side) {
        System.out.println("This polygon has " + side + " sides.");
    }
}

class Rectangle extends Polygon {
    // implement abstract method
    void getArea() {
        System.out.println("Area of Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        
        // create object of Rectangle
        Rectangle obj = new Rectangle();

        // call regular method
        obj.printSides(4);

        // call abstract method
        obj.getArea();
    }
}