package deshaw.ascend.session3.annotations;

import java.lang.reflect.Method;

public class Runner {

    @SampleAnnotation(attribute1 = "A", attribute2 = 1)
    public void sampleMethod() {
        // No-op
    }

    public static void main(String[] args) {
        for (Method method : Runner.class.getMethods()) {
            SampleAnnotation annotation = method.getAnnotation(SampleAnnotation.class);
            if (annotation != null) {
                System.out.println(method.getName());
                System.out.println(annotation.attribute1());
                System.out.println(annotation.attribute2());
            }
        }

        Runner runner = new Runner();

    }
}
