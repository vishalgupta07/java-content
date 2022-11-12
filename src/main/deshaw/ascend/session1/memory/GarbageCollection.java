package deshaw.ascend.session1.memory;

import java.lang.ref.WeakReference;

/**
 * Verbose garbage collection in Java
 * @see <a href="https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html">Oracle GC Documentation</a>
 */
public class GarbageCollection {

    public static void main(String[] args) {

        // Creation of object on heap
        Object object = new Object();
        // Assigning a reference to it to keep track once we disconnect the reference variable and object in memory
        WeakReference<Object> ref = new WeakReference<>(object);
        // Nullify the object
        object = null;

        while (ref.get() != null) {
            System.out.println("Before trigger: " + ref);
            // Force gc run trigger
            System.gc();
            System.out.println("After trigger: " + ref);
        }
    }
}
