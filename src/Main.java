/*
#Java Syntax
#1st ex.
public class Main {
    public static void main(String[] args) {
                System.out.println("Hello and welcome!");
    }
}

#Output(Print text) Print() method
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");
    }
}
#Print numbers
public class Main {
  public static void main(String[] args) {
    System.out.println(3 + 3);
  }
}
#Int variable
public class Main {
  public static void main(String[] args) {
    int myNum = 15;
    System.out.println(myNum);
  }
}

#String variable
public class Main {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
    }
}
#Change the value of myNum from 15 to 20:
public class Main {
  public static void main(String[] args) {
    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);
  }
}
#final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
public class Main {
  public static void main(String[] args) {
    final int myNum = 15;
    myNum = 20; // will generate an error
    System.out.println(myNum);
  }
}

public class Main {
  public static void main(String[] args) {
    // Student data
    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';

    // Print variables
    System.out.println("Student name: " + studentName);
    System.out.println("Student id: " + studentID);
    System.out.println("Student age: " + studentAge);
    System.out.println("Student fee: " + studentFee);
    System.out.println("Student grade: " + studentGrade);
  }

}

public class Main {
  public static void main(String[] args) {
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
  }
}
public class Main {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
  }
}

public class Main {
  public static void main(String[] args) {
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);
  }
}

public class Main {
  public static void main(String[] args) {
    // Create variables of different data types
    int items = 50;
    float costPerItem = 9.99f;
    float totalCost = items * costPerItem;
    char currency = '$';

    // Print variables
    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost = " + totalCost + currency);
  }
}
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);
  }
}
#narrow type casting
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}

public class Main {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
  }
}
public class Main {
  public static void main(String[] args) {
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
  }
}
public class Main {
  public static void main(String[] args) {
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
  }
}

public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}
public class Main {
  public static void main(String[] args) {
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}
public class Main {
  public static void main(String[] args) {
    int time = 20;
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
}


public class Main {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}


public class Main {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);
  }
}
public class Main {
  public static void main(String[] args) {
    int dice = 1;

    while (dice <= 6) {
      if (dice < 6) {
        System.out.println("No Yatzy.");
      } else {
        System.out.println("Yatzy!");
      }
      dice = dice + 1;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    // Outer loop.
    for (int i = 1; i <= 2; i++) {
      System.out.println("Outer: " + i); // Executes 2 times

      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }
  }
}


public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
  }
}


public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    System.out.println(cars[0]);
  }
}
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]);
  }
}
 */

import lab2.Circle;
import lab2.MyShape;
import lab2.Rectangle;
import lab2.Square;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<MyShape, String> myHashMap = new HashMap<>();
        Circle myCircle = new Circle(0, 0, 1);
        Rectangle myRectangle = new Rectangle(0, 1, 1, 0);
        Square mySquare = new Square(0, 1, 1);

        myHashMap.put(myCircle, "CIRCLE");
        myHashMap.put(myRectangle, "RECTANGLES");
        myHashMap.put(mySquare, "SQUARES");

        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));

        Circle circleWithSameAttributes = new Circle(0, 0, 1);
        myHashMap.put(circleWithSameAttributes, "SAME CIRCLES");
        System.out.println("ADDED CIRCLE WITH SAME ATTRIBUTES - " + myHashMap.size() + " " + myHashMap.get(myCircle));


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter xCoordinate for myCircle: ");
//        int xCoordinate = scanner.nextInt();
//
//        System.out.print("Enter yCoordinate for myCircle: ");
//        int yCoordinate = scanner.nextInt();
//
//        System.out.print("Enter radius for myCircle: ");
//        int radius = scanner.nextInt();
//
//        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
//        System.out.println(myCircle);
//        System.out.println("Area: " + myCircle.getArea());
//        System.out.println("Circumference: " + myCircle.getCircumference());
//
//        System.out.print("Enter xCoordinate for secondCircle: ");
//        int xCoordinate2 = scanner.nextInt();
//
//        System.out.print("Enter yCoordinate for secondCircle: ");
//        int yCoordinate2 = scanner.nextInt();
//
//        System.out.print("Enter radius for secondCircle: ");
//        int radius2 = scanner.nextInt();
//
//        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
//        double distance = myCircle.getDistanceTo(secondCircle);
//        System.out.println("Distance to secondCircle: " + distance);
//        System.out.print("Enter xTopLeftCoordinate for first rectangle: ");
//        int xTopLeftCoordinate1 = scanner.nextInt();
//
//        System.out.print("Enter yTopLeftCoordinate for first rectangle: ");
//        int yTopLeftCoordinate1 = scanner.nextInt();
//
//        System.out.print("Enter xBottomRightCoordinate for first rectangle: ");
//        int xBottomRightCoordinate1 = scanner.nextInt();
//
//        System.out.print("Enter yBottomRightCoordinate for first rectangle: ");
//        int yBottomRightCoordinate1 = scanner.nextInt();
//
//        Rectangle rectangle1 = new Rectangle(xTopLeftCoordinate1, yTopLeftCoordinate1, xBottomRightCoordinate1, yBottomRightCoordinate1);
//        System.out.println(rectangle1);
//        System.out.println("Area: " + rectangle1.getArea());
//        System.out.println("Perimeter: " + rectangle1.getPerimeter());
//
//        System.out.print("Enter xTopLeftCoordinate for second rectangle: ");
//        int xTopLeftCoordinate2 = scanner.nextInt();
//
//        System.out.print("Enter yTopLeftCoordinate for second rectangle: ");
//        int yTopLeftCoordinate2 = scanner.nextInt();
//
//        System.out.print("Enter xBottomRightCoordinate for second rectangle: ");
//        int xBottomRightCoordinate2 = scanner.nextInt();
//
//        System.out.print("Enter yBottomRightCoordinate for second rectangle: ");
//        int yBottomRightCoordinate2 = scanner.nextInt();
//
//        Rectangle rectangle2 = new Rectangle(xTopLeftCoordinate2, yTopLeftCoordinate2, xBottomRightCoordinate2, yBottomRightCoordinate2);
//        double distanceToCenter = rectangle1.getDistanceToTheCenterOf(rectangle2);
//        System.out.println("Distance to second rectangle: " + distanceToCenter);
//
//        // Работа с MyShape
//        System.out.print("Enter color for MyShape: ");
//        String initialColor = scanner.next();
//
//        System.out.print("Is filled (true/false) for MyShape: ");
//        boolean filled = scanner.nextBoolean();
//
//        MyShape shape = new MyShape(initialColor, filled);
//        System.out.println(shape);
//
//        System.out.print("Enter new color for MyShape: ");
//        String updatedColor = scanner.next();
//        shape.setColor(updatedColor);
//        System.out.println("Updated MyShape: " + shape);
//        System.out.print("Enter xTopLeftCoordinate for square: ");
//        int xTopLeftCoordinateSquare = scanner.nextInt();
//
//        System.out.print("Enter yTopLeftCoordinate for square: ");
//        int yTopLeftCoordinateSquare = scanner.nextInt();
//
//        System.out.print("Enter sideLength for square: ");
//        int sideLength = scanner.nextInt();
//
//        Square square = new Square(xTopLeftCoordinateSquare, yTopLeftCoordinateSquare, sideLength);
//        System.out.println(square);
//        System.out.println("Area: " + square.getArea());
//        System.out.println("Perimeter: " + square.getPerimeter());
//        System.out.println("Color: " + square.getColor());
//        System.out.println("Filled: " + square.isFilled());
//
//        System.out.print("Enter new color for square: ");
//        String newColorSquare = scanner.next();
//        square.setColor(newColorSquare);
//        System.out.println("Updated Square: " + square);








//        System.out.print("Enter xTopLeftCoordinate for square: ");
//        int xTopLeftCoordinateSquare = scanner.nextInt();
//
//        System.out.print("Enter yTopLeftCoordinate for square: ");
//        int yTopLeftCoordinateSquare = scanner.nextInt();
//
//
//        System.out.print("Enter sideLength ");
//        int sideLength = scanner.nextInt();
//        Square square = new Square( xTopLeftCoordinateSquare,yTopLeftCoordinateSquare, sideLength);
//        System.out.println(square.getPerimeter());



    }
}


