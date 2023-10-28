import java.io.FileReader;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        char[] contents = new char[1000];

        try {
            FileReader sourceFile = new FileReader("testFile.txt");
            FileWriter destFile = new FileWriter("output.txt");
            // FileWriter destFile = new FileWriter("output2.txt");

            // reads all data from input.txt
            sourceFile.read(contents);

            // remove arrays null paddings
            // int len = 0;
            // do {
            //     len++;
            // } while (contents.length > len && contents[len] != '\0');
            // String s = new String(contents, 0, len);

            // writes all data to newFile
            // destFile.write(s);
            destFile.write(contents);

            // close streams
            sourceFile.close();
            destFile.close();
        }

        catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}