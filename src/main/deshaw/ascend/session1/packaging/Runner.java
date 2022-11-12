package deshaw.ascend.session1.packaging;

public class Runner {

    public static void main(String[] args) {
        deshaw.ascend.session1.packaging.v1.SimpleList listV1 =
                new deshaw.ascend.session1.packaging.v1.SimpleList();
        listV1.add("John");
        listV1.add("Jane");
        System.out.println(listV1);

        deshaw.ascend.session1.packaging.v2.SimpleList listV2 =
                new deshaw.ascend.session1.packaging.v2.SimpleList();
        listV2.add("John");
        listV2.add("Jane");
        System.out.println(listV2);
    }
}
