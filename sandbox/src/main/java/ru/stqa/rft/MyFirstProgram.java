package ru.stqa.rft;

public class MyFirstProgram {
  public static void main(String[] args) {
    Hello("world");
    Hello("Alexei");

    Square s= new Square(5);

    System.out.println("Площадь квадрата со стороной "+s.l+"="+s.area());

    Rectangle r = new Rectangle(4,6);

    System.out.println("Площадь прямоугольника со сторона "+r.a+" и "+r.b+" равна "+r.area());

  }
  public static void Hello(String somebody) {
    System.out.println("Hello,"+somebody+"!");
  }
  public static double area(Square s){
    return s.l*s.l;
  }

}