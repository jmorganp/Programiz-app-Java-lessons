class Test {
    // private variable
    private String name;
    
    // getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        // create an object of Test
        Test t1 = new Test();

        // access the private variable
        t1.setName("Java Programming");
        System.out.println(t1.getName());
    }
}

// Output: Java Programming