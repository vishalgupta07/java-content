package deshaw.ascend.session1.packaging.v1;

import java.util.ArrayList;

public class SimpleList {

    private final ArrayList<String> dataList = new ArrayList<>();

    public void add(String data) {
        dataList.add(data + "-v1");
    }

    public String toString() {
        return "This is v1 version of list. List: " + dataList;
    }
}
