import java.io.FileReader;

class Main {
    public static void main(String[] args) {

        char[] contents = new char[100];

        try {
            // create a reader using the FileReader
            FileReader input = new FileReader("testFile.txt");

            // read characters
            input.read(contents);
            System.out.println(contents);

            // close the reader
            input.close();
        }

        catch (Exception e ) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}