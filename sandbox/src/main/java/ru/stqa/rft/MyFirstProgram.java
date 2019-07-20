package ru.stqa.rft;

public class MyFirstProgram {
  public static void main(String[] args) {
    Hello("world");
    Hello("Alexei");

    Square s = new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со сторона " + r.a + " и " + r.b + " равна " + r.area());

    Point p = new Point(-2,2,1,-2);

    System.out.println("расстояние между точками p1 b p2 с координатами ("+p.x1+";"+p.y1+") и ("+p.x2+";"+p.y2+") равна " + p.distance());

  }

  public static void Hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }


}

