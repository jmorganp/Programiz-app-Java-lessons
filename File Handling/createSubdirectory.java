import java.io.File;

class Main {
    public static void main(String[] args) {
        // creates a file object with the specified path
        File file = new File("movies/John Wick");

        // tries to create a new direcotry
        boolean value = file.mkdir();

        if (value) {
            System.out.println("The subdirectory is created.");
        }
        else {
            System.out.println("The subdirectory already exists.");
        }
    }
}