package deshaw.ascend.session3.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class SetCollection {

    static class HashedSample {

        private String hashValue1;

        private String hashValue2;

        public HashedSample(String hashValue1, String hashValue2) {
            this.hashValue1 = hashValue1;
            this.hashValue2 = hashValue2;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            HashedSample that = (HashedSample) object;
            return hashValue1.equals(that.hashValue1) && hashValue2.equals(that.hashValue2);
        }

        @Override
        public int hashCode() {
            int randomValue = new Random().nextInt();
            return hashValue1.hashCode() + hashValue2.hashCode() + randomValue;
        }

        @Override
        public String toString() {
            return "HashedSample{" +
                    "hashValue1='" + hashValue1 + '\'' +
                    ", hashValue2='" + hashValue2 + '\'' +
                    '}';
        }
    }

    private static void hashSetExample() {
        HashedSample hashedSample = new HashedSample("A", "B");
        Set<HashedSample> set = new HashSet<>();
        set.add(hashedSample);
        set.add(hashedSample);
        for (HashedSample sample : set) {
            System.out.println(sample);
        }
    }

    public static void main(String[] args) {
        hashSetExample();
    }
}
