package ru.stqa.rft;

public class MyFirstProgram {
  public static void main(String[] args) {
    Hello("world");
    Hello("Alexei");
    double ll=5;
    System.out.println("Площадь квадрата со стороной "+ll+"="+area(ll));

    double a=4;
    double b=6;
    System.out.println("Площадь прямоугольника со сторона "+a+" и "+b+" равна "+area(a,b));

  }
  public static void Hello(String somebody) {
    System.out.println("Hello,"+somebody+"!");
  }
  public static double area(double len){
    return len*len;
  }
  public static double area(double a, double b){
    return a*b;
  }
}