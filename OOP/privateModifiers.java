class Data {
    // private variable
    private String name;
}

class Main {
    public static void main(String[] args) {
        // create an object of Data
        Data d1 = new Data();

        // Error code
        d1.name = "Java";
    }
}

/*
 * Inside the "Main" class, we have created an object of the "Data" class and accessed the "name" field.
 * 
 * Since the "name" field is private to the "Data" class, it cannot be accessed from the "Main" class.
 * That's why the program throws an error.
 */