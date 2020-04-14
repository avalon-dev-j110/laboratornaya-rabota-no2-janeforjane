package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        Random random = new Random();

        for(int i = 0; i < shapes.length; i++) {

            if (i % 3 == 0 || i == 0) {
                PointImpl pointA = new PointImpl(random.nextFloat(),random.nextFloat());
                PointImpl pointB = new PointImpl(random.nextFloat(),random.nextFloat());
                PointImpl pointC = new PointImpl(random.nextFloat(),random.nextFloat());

                shapes[i] = new Rectangle(pointA, pointB, pointC);
            }
            else if (i % 2 == 0){

                PointImpl pointA = new PointImpl(random.nextFloat(),random.nextFloat());
                PointImpl pointB = new PointImpl(random.nextFloat(),random.nextFloat());
                PointImpl pointC = new PointImpl(random.nextFloat(),random.nextFloat());

                shapes[i] = new Triangle(pointA, pointB, pointC);
            }
            else {

                PointImpl center = new PointImpl(random.nextFloat(),random.nextFloat());
                PointImpl pointOnCircle = new PointImpl(random.nextFloat(),random.nextFloat());
                shapes[i] = new Circle(center, pointOnCircle);
            }
        }

        int numShape = 0;
        float maxArea = shapes[0].getArea();


        for(int i = 1; i < shapes.length; i++) {


             if (shapes[i].getArea() > maxArea) {
                maxArea = shapes[i].getArea();
                numShape = i;
            }
        }

        System.out.println("Max Area has element № "  + numShape + ". It is " + " = "+ maxArea);


        System.out.println("-------------");
        System.out.println("Areas of all elements:");



        for(int i = 0; i < shapes.length; i++) {
            System.out.println(" Area of element № " + i + " = " + shapes[i].getArea());

        }


        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
}
