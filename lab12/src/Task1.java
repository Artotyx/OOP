import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");
        Set<String> clone1 = new LinkedHashSet<>(set1);
        Set<String> clone2 = new LinkedHashSet<>(set2);

        Set<String> union = new LinkedHashSet<>(clone1);
        union.addAll(clone2);
        System.out.println("Union: " + union);
        Set<String> difference = new LinkedHashSet<>(clone1);
        difference.removeAll(clone2);
        System.out.println("Difference (set1 - set2): " + difference);
        Set<String> intersection = new LinkedHashSet<>(clone1);
        intersection.retainAll(clone2);
        System.out.println("Intersection: " + intersection);
    }
}
