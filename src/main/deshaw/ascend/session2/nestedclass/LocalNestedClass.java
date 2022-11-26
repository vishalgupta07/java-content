package deshaw.ascend.session2.nestedclass;

/**
 * Class to demonstrate local nested class
 */
public class LocalNestedClass {

    void foo() {

        class NestedClass {

            void bar() {
                // No-op
            }
        }

        NestedClass nestedClass = new NestedClass();
        nestedClass.bar();
    }


    public static void main(String[] args) {
        LocalNestedClass localNestedClass = new LocalNestedClass();
        localNestedClass.foo();
    }
}
