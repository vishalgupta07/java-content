package deshaw.ascend.session2.nestedclass;

/**
 * Class to demonstrate declaration of static nested class
 */
public class StaticNestedClass {

    public static class NestedClass {
        private int foo1;

        private static String foo2;

        private void foo() {
            // No-op
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.foo();
    }
}
