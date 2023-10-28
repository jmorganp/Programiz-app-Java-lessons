class Main {
    public static void main(String[] args) {
        int number = 10;
        // declare flag in the main()
        // method scope
        boolean flag;

        if (number > 0) {
            flag = true;
        }

        System.out.println(flag);
    }
}

/*
 * Here, we have declared 'flag' inside the scope of the main() method.
 * Now, 'flag' can be accessed anywhere from inside main().
 */