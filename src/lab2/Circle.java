package lab2;

public class Circle {
    double xCoordinate;
    double yCoordinate;
    double radius;

    public Circle(double xCoordinate, double yCoordinate, double radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                '}';
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    // Метод для расчета расстояния до другого круга
    public double getDistanceTo(Circle anotherCircle) {
        double dx = this.xCoordinate - anotherCircle.xCoordinate;
        double dy = this.yCoordinate - anotherCircle.yCoordinate;
        return Math.sqrt(dx * dx + dy * dy);
    }


}





