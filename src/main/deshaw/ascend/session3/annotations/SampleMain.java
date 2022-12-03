package deshaw.ascend.session3.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class SampleMain {

    static class Person {

        private String name;

        @MaxAge(20)
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public boolean validateAge() throws NoSuchFieldException {
            Field ageField = Person.class.getDeclaredField("age");
            MaxAge maxAgeAnnotation = ageField.getAnnotation(MaxAge.class);
            int maxAge = maxAgeAnnotation.value();
            return this.age < maxAge;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface MaxAge {
        int value();
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Person person = new Person("Jane Doe", 21);
        System.out.println(person.validateAge());
    }
}
