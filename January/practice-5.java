import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) {
        Object obj = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(obj);

        obj = null;
        System.gc();

        System.out.println("Object collected: " + (weakRef.get() == null));
    }
}
