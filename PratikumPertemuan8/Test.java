
public class Test {

    public static void foo() {
        System.out.println("Test.foo() dipanggil ");
    }

    // output: Compiler Error: cannot redefine foo()
    public static void foo(int x) {
        System.out.println("Test.foo(int) dipanggil ");
    }

    public static void main(String args[]) {
        Test.foo();

        Test.foo(11);

        Test.main(10);
    }

    public static void main(int x) {
        System.out.println("Test.main(int) dipanggil ");
    }
}
