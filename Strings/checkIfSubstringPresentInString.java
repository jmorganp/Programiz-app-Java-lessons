class Main {
    public static void main(String[] args) {
        // create a string
        String text = "This is Java Programming.";
        String subString = "Java";

        // check if subString is present in text
        boolean result = text.contains(subString);

        if (result) {
            System.out.println("Substring is present.");
        }
        else {
            System.out.println("Substring is not present.");
        }
    }
}

// Output: Substring is present.