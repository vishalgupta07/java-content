package deshaw.ascend.session1.structures;

import deshaw.ascend.session1.packaging.v1.SimpleList;

public class ReferenceVariable {

    public static void main(String[] args) {
        /*
        Step 1: SimpleList simpleList
        Tells the JVM to allocate space for a reference variable, and names that
        variable simpleList. The reference variable is of type simpleList.

        Step 2: new SimpleList()
        Tells the JVM to allocate space for a new SimpleList object on the heap

        Step 3: =
        Assigns the new SimpleList to the reference variable simpleList.ln other words,
        programs the remote control
         */
        SimpleList simpleList = new SimpleList();
    }
}
