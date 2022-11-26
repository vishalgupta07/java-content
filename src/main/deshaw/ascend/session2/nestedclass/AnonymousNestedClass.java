package deshaw.ascend.session2.nestedclass;

/**
 * Class to demonstrate declaration of anonymous nested class
 */
public class AnonymousNestedClass {

    public static void main(String[] args) {

        SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
            @Override
            void foo() {
                // No-op
                System.out.println("foo");
            }

            @Override
            void bar() {
                System.out.println("bar");
            }
        };
        simpleAbstractClass.foo();
    }
}
