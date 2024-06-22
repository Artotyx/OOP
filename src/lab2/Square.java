package lab2;
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength);
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength, color, filled);
    }
//
  public int getSideLength() {
        return Math.abs(getXBottomRightCoordinate() - getXTopLeftCoordinate());
  }

    public double getArea() {
        return getSideLength() * getSideLength();
    }

    public double getPerimeter() {
        return 4 * getSideLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + getSideLength() +
                "} which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Square square = (Square) obj;
        return getSideLength() == square.getSideLength() &&
                getArea() == square.getArea() &&
                getPerimeter() == square.getPerimeter();
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (getSideLength() != 0) {
            result = 31 * result + getSideLength();
        }
        return result;
    }
}
