package lab2;

public class Circle extends MyShape {
    private int xCoordinate;
    private int yCoordinate;
    private int radius;

    public Circle() {
        super();
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.radius = 1;
    }

    public Circle(int xCoordinate, int yCoordinate, int radius) {
        super();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public Circle(int xCoordinate, int yCoordinate, int radius, String color, boolean filled) {
        super(color, filled);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                "} which is subclass of " + super.toString();
    }


    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getDistanceTo(Circle anotherCircle) {
        return Math.sqrt(Math.pow(this.xCoordinate - anotherCircle.xCoordinate, 2) +
                Math.pow(this.yCoordinate - anotherCircle.yCoordinate, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return xCoordinate == circle.xCoordinate &&
                yCoordinate == circle.yCoordinate &&
                radius == circle.radius;
    }

    public int hashCode(){
        int result = 17;
        if (xCoordinate != 0) {
            result = 31 * result + xCoordinate;
        }
        if (yCoordinate != 0) {
            result = 31 * result + yCoordinate;
        }
        if (radius != 0) {
            result = 31 * result + radius;
        }
        return result;
    }

}






