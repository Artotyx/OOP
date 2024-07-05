
import java.util.Comparator;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return this.x - other.x;
        } else {
            return this.y - other.y;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y != p2.y) {
            return p1.y - p2.y;
        } else {
            return p1.x - p2.x;
        }
    }
}

