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
import lab2.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 4: Считать координаты центра и радиус с консоли
        System.out.println("Coord. of the centers of circle(x, y): ");
        double xCoordinate = scanner.nextDouble();
        double yCoordinate = scanner.nextDouble();
        System.out.println("Radius: ");
        double radius = scanner.nextDouble();

        // Шаг 5: Создать объект myCircle класса Circle
        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);

        // Шаг 6: Вывести объект myCircle в консоль
        System.out.println(myCircle);

        // Шаги 7-9: Вывести площадь и длину окружности круга
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Length: " + myCircle.getCircumference());

        // Шаг 11: Считать координаты центра и радиус с консоли для второго круга
        System.out.println("Coord. of the centers of circle(x, y):");
        double xCoordinate2 = scanner.nextDouble();
        double yCoordinate2 = scanner.nextDouble();
        System.out.println("Radius:");
        double radius2 = scanner.nextDouble();

        // Создать объект secondCircle класса Circle
        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);

        // Вывести объект secondCircle в консоль
        System.out.println(secondCircle);
        System.out.println("Area: " + secondCircle.getArea());
        System.out.println("Length: " + secondCircle.getCircumference());

        // Шаг 12: Вывести расстояние от центра myCircle до secondCircle
        double distance = myCircle.getDistanceTo(secondCircle);
        System.out.println("Dist between centers of circles: " + distance);

        // Считывание координат для первого прямоугольника
        System.out.println("Enter coord. left top and right bottom points of rect(x1 y1 x2 y2): ");
        double rx1 = scanner.nextDouble();
        double ry1 = scanner.nextDouble();
        double rx2 = scanner.nextDouble();
        double ry2 = scanner.nextDouble();

        Rectangle firstRectangle = new Rectangle(rx1, ry1, rx2, ry2);
        System.out.println(firstRectangle);
        System.out.println("Area: " + firstRectangle.getArea());
        System.out.println("Perimeter: " + firstRectangle.getPerimeter());

        // координаты для второго прямоуголь
        System.out.println("Enter coord. left top and right bottom points of rect(x1 y1 x2 y2):");
        double rx3 = scanner.nextDouble();
        double ry3 = scanner.nextDouble();
        double rx4 = scanner.nextDouble();
        double ry4 = scanner.nextDouble();

        Rectangle secondRectangle = new Rectangle(rx3, ry3, rx4, ry4);
        System.out.println(secondRectangle);
        System.out.println("Area: " + secondRectangle.getArea());
        System.out.println("Perimeter: " + secondRectangle.getPerimeter());

        // расстояния между центрами прямоугол
        double rectangleDistance = firstRectangle.getDistanceToTheCenterOf(secondRectangle);
        System.out.println("Dist between centers of two rect: " + rectangleDistance);

        scanner.close();

        scanner.close();
    }
}


