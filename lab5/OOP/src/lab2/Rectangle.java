package lab2;
public class Rectangle extends MyShape {
    private int xTopLeftCoordinate;
    private int yTopLeftCoordinate;
    private int xBottomRightCoordinate;
    private int yBottomRightCoordinate;

    public Rectangle() {
        super();
        this.xTopLeftCoordinate = 0;
        this.yTopLeftCoordinate = 0;
        this.xBottomRightCoordinate = 1;
        this.yBottomRightCoordinate = -1;
    }

    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
        super();
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate, String color, boolean filled) {
        super(color, filled);
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public int getXTopLeftCoordinate() {
        return xTopLeftCoordinate;
    }

    public void setXTopLeftCoordinate(int xTopLeftCoordinate) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
    }

    public int getYTopLeftCoordinate() {
        return yTopLeftCoordinate;
    }

    public void setYTopLeftCoordinate(int yTopLeftCoordinate) {
        this.yTopLeftCoordinate = yTopLeftCoordinate;
    }

    public int getXBottomRightCoordinate() {
        return xBottomRightCoordinate;
    }

    public void setXBottomRightCoordinate(int xBottomRightCoordinate) {
        this.xBottomRightCoordinate = xBottomRightCoordinate;
    }

    public int getYBottomRightCoordinate() {
        return yBottomRightCoordinate;
    }

    public void setYBottomRightCoordinate(int yBottomRightCoordinate) {
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 4 * (getLength());
    }

    public double getLength() {
        return Math.abs(xBottomRightCoordinate - xTopLeftCoordinate);
    }

    public double getWidth() {
        return Math.abs(yTopLeftCoordinate - yBottomRightCoordinate);
    }

    public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
        double thisCenterX = (xTopLeftCoordinate + xBottomRightCoordinate) / 2.0;
        double thisCenterY = (yTopLeftCoordinate + yBottomRightCoordinate) / 2.0;
        double anotherCenterX = (anotherRectangle.xTopLeftCoordinate + anotherRectangle.xBottomRightCoordinate) / 2.0;
        double anotherCenterY = (anotherRectangle.yTopLeftCoordinate + anotherRectangle.yBottomRightCoordinate) / 2.0;
        return Math.sqrt(Math.pow(thisCenterX - anotherCenterX, 2) + Math.pow(thisCenterY - anotherCenterY, 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "xTopLeftCoordinate=" + xTopLeftCoordinate +
                ", yTopLeftCoordinate=" + yTopLeftCoordinate +
                ", xBottomRightCoordinate=" + xBottomRightCoordinate +
                ", yBottomRightCoordinate=" + yBottomRightCoordinate +
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
        Rectangle rectangle = (Rectangle) obj;
        return getArea() == rectangle.getArea() &&
                getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth() &&
                getPerimeter() == rectangle.getPerimeter();
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (xBottomRightCoordinate != 0) {
            result = 31 * result + xBottomRightCoordinate;
        }
        if (xTopLeftCoordinate != 0) {
            result = 31 * result + xTopLeftCoordinate;
        }
        if (yBottomRightCoordinate != 0) {
            result = 31 * result + yBottomRightCoordinate;
        }
        if (yTopLeftCoordinate != 0) {
            result = 31 * result + yTopLeftCoordinate;
        }
        return result;
    }
}

