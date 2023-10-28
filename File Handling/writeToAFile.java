import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        
        String data = "This is a test data.";
        try {
            // create a writer using FileWriter
            FileWriter output = new FileWriter("testFile.txt");

            // write string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // close the writer
            output.close();
        }

        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}