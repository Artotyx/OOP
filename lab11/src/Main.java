//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Point[] points = new Point[100];
//        for (int i = 0; i < 100; i++) {
//            points[i] = new Point((int) (Math.random() * 100), (int) (Math.random() * 100));
//        }
//
//        System.out.println("Original points:");
//        System.out.println(Arrays.toString(points));
//
//        Arrays.sort(points);
//        System.out.println("Points sorted by x-coordinates:");
//        System.out.println(Arrays.toString(points));
//
//        Arrays.sort(points, new CompareY());
//        System.out.println("Points sorted by y-coordinates:");
//        System.out.println(Arrays.toString(points));
//    }
//}
import java.util.LinkedList;
import java.util.Iterator;

//Task6
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Time using get(index): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("Time using iterator: " + (endTime - startTime) + " ns");
    }
}