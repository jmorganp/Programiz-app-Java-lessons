class Main {
    public static void main(String[] args) {
        // create strings
        String str1 = "Learn Java";
        String str2 = "Learn Kotlin";

        // comparing str1 and str2

        System.out.println(str1.equals(str2));

        if (str1.equals(str2)) {
            System.out.println("Equal strings");
        }
        else {
            System.out.println("Non-equal strings");
        }
    }
}

// Output:
// false
// Non-equal strings