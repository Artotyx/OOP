import java.util.ArrayList;

public class Task3 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
