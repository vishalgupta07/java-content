package deshaw.ascend.session1.structures;

public class StaticVariable {

    static class SampleA {
        private static Integer count = 0;

        public SampleA() {
            count++;
        }

        public static Integer getCount() {
            return count;
        }
    }

    static class SampleB {
        private static Integer count = 0;

        public SampleB() {
            count++;
        }

        public static Integer getCount() {
            return count;
        }
    }

    private static void printCounts() {
        System.out.println("SampleA's count = " + SampleA.getCount());
        System.out.println("SampleB's count = " + SampleB.getCount());
    }

    public static void main(String[] args) {
        SampleA sampleA1 = new SampleA();
        SampleA sampleA2 = new SampleA();
        printCounts();

        SampleB sampleB1 = new SampleB();
        printCounts();
    }
}
