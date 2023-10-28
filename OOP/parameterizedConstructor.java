class Student {
    String name;
    int id;

    // constructor with parameters
    Student(String student_name, int id) {
        this.name = student_name;
        this.id = id;
    }

    public static void main(String[] args) {
        // pass value to constructor
        Student s1 = new Student("Alex", 1);
        Student s2 = new Student("Mary", 5);

        // printing fields
        System.out.println("student1 name: " + s1.name);
        System.out.println("student1 id: " + s1.id);
        System.out.println("student2 name: " + s2.name);
        System.out.println("student2 id: " + s2.id);
    }
}

/*
 * Inside the class, "this" refers to the current object
 * 1. When s1 object is created
 *      the constructor is called
 *      "this.name" refers to the "name" field of the s1 object which will be "Alex"
 *      "this.id" refers to the "id" field of "s1" which will be "1"
 * 
 * Note: If a class doesn't have any constructors, 
 * Java automatically creates a default constructor to assign default values.
 * That is, "int" fields are assigned with 0 and "String" fields are assigned "null"
 */