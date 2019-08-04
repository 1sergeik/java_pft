package ru.stqa.rft;

public class MyFirstProgram {
  public static void main(String[] args) {
    Hello("world");
    Hello("Alexei");

    Square s = new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со сторона " + r.a + " и " + r.b + " равна " + r.area());

    Point p1 = new Point(-2.0,-9.0);
    Point p2 = new Point (-5.0,-5.0);
    System.out.println("Расстояние между точками p1 и p2 с координатами ("+p1.x +";"+p1.y +") и ("+p2.x+";"+p2.y+") равна " + p1.distance(p1,p2));

  }

  public static void Hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }



}

