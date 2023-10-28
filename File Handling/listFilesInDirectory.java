import java.io.File;
// import java.util.ArrayList;
// import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // creates a file object
        File file = new File(".");  // "." represents current dir

        /// returns an array of all files & directories
        String[] fileList = file.list();

        for (String str : fileList) {
            System.out.println(str);
        }

        System.out.println("Total Files/Directories: " + fileList.length);


        // print only file names (skip directories)
        // ArrayList<String> fileList2 = new ArrayList<>(Arrays.asList(fileList));
        
        // for (int i = 0; i < fileList2.size(); i++) {
        //     String fileName = fileList2.get(i);
        //     File file_ = new File(fileName);

        //     if (file_.isDirectory()) {
        //         fileList2.remove(i);
        //     }
        // }

        // for (String str : fileList2) {
        //     System.out.println(str);
        // }

        // System.out.println("Total Files: " + fileList.length);
    }
}