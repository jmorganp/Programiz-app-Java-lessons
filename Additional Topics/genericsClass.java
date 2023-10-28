class Main {
    public static void main(String[] args) {
        
        // MyClass object with Integer data
        MyClass<Integer> intObj = new MyClass<>(5);

        // MyClass object with String data
        MyClass<String> stringObj = new MyClass<>("Java");

        
    }

}

// create a generics class
class MyClass<T> {
    public MyClass(T data) {
        System.out.println("Data: " + data);
    }
}