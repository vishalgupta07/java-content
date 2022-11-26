package deshaw.ascend.session2.nestedclass;

/**
 * Class to demonstrate non-static nested class
 */
public class NonStaticNestedClass {

    private String privateInstanceMember = "NonStaticNestedClass-Private";

    private static String foo = "foo";

    public class NestedClass {

        private String privateInstanceMember = "NonStaticNestedClass.NestedClass-Private";

        public void foo() {
            // Inner class shadowing
            System.out.println(foo);
            System.out.println(privateInstanceMember);
            System.out.println(NonStaticNestedClass.this.privateInstanceMember);
        }
    }


    public static void main(String[] args) {
        NonStaticNestedClass nonStaticNestedClass = new NonStaticNestedClass();
        NestedClass nestedClass = nonStaticNestedClass.new NestedClass();
        nestedClass.foo();
    }
}
