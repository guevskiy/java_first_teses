package com.artem.g;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("1) Hello, world!");
        System.out.println("2) Hello, world!");

        Square s = new Square(7.2);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    }


}