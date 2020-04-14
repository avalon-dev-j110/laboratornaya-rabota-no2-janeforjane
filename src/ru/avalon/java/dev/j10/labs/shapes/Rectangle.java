package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private PointImpl pointA;
    private PointImpl pointB;
    private PointImpl pointC;


    private double length;
    private double width;


    public Rectangle (PointImpl pointA, PointImpl pointB, PointImpl pointC){

        double pointAX = pointA.getX();
        double pointAY = pointA.getY();
        double pointBX = pointB.getX();
        double pointBY = pointB.getY();
        double pointCX = pointC.getX();
        double pointCY = pointC.getY();

        double lineABX = Math.pow((pointBX - pointAX),2);
        double lineABY = Math.pow((pointBY - pointAY),2);
        double lineBCX = Math.pow((pointCX - pointBX),2);
        double lineBCY = Math.pow((pointCY - pointBY),2);

        length = Math.sqrt(lineABX + lineABY);
        width = Math.sqrt(lineBCX + lineBCY);

    }

    @Override
    public float getPerimeter() {
        double perRec = 2* (length + width);
        float perRec2 = (float) perRec;
        return perRec2;
    }

    @Override
    public float getArea() {
        double areaRec = length * width;
        float areaRec2 = (float) areaRec;
        return areaRec2;
    }


    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
