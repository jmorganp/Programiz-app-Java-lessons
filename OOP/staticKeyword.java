class Main {
    public static void main(String[] args) {
        // access the static field/method
        Student.subject = "Computer Science";
        Student.displaySubject();
    }
}

class Student {
    // static field
    static String subject;

    // static field
    static void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}