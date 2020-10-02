public class MethodsExercisesExamples {
    //    public static returnType methodName ([param1[, param2[, ...]]]){
    //        // the statements of the method
    //        // a return statement, if a return type is declared
    //    }
    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void main(String [] args){
        sayHello("Josh");
        System.out.println(returnThree());
        System.out.println(shout("Let it all out"));

        count(6);
    }
}
