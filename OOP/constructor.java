class Student {
    String name;
    int id;

    // constructor
    Student() {
        System.out.println("Initializing values: ");
        name = "NA";
        id = -1;
    }

    public static void main(String[] args) {
        // creating an object
        Student s1 = new Student();
        System.out.println("Name: " + s1.name);
        System.out.println("Id: " + s1.id);
    }
}