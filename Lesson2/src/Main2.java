import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        testArreyLest();
        String str = "str";



    }

    private static void testArreyLest() {
        List<String> collection = new ArrayList<>(10);

        collection.add("c1");
        collection.add("c2");
        collection.add("c4");
        collection.add("c5");
        collection.add(2, "c3");

        System.out.println("Index: " + collection.indexOf("c5"));
        System.out.println("Size: " + collection.size());
        System.out.println("Value: " + collection.get(1));
        System.out.println("----------");

        collection.remove(0);
        collection.add("c1");
        collection.remove("c4");
        collection.set(0, "c24");

        for (String s: collection
             ) {
            System.out.println(s);

        }
        List<Integer> f = new ArrayList<>(11);
    }
}
