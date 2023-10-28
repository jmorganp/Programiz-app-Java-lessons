class Data {
    // public field
    public String name;
}

class Main {
    public static void main(String[] args) {
        // create an object of Data
        Data d1 = new Data();

        d1.name = "Java";
        System.out.println(d1.name); // Java
    }
}

/*
 * If we declare a field/method "public", it can be accessed from anywhere
 * (from the same class and from outside classes)
 * 
 * Here, we can access the "name" field of the "Data" class from inside the "Main" class.
 * It's possible because the "name" field is "public"
 * 
 * Note: The "main()" method is also public. It's because the Java compiler needs to call this method
 * when the program starts.
 */