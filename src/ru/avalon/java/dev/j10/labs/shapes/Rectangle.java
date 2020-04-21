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


    public Rectangle (PointImpl pointA, PointImpl pointB, PointImpl pointC){

        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

    }

    private double getLength () {

        double lineABX = Math.pow((pointB.getX()- pointA.getX()),2);
        double lineABY = Math.pow((pointB.getY() - pointA.getY()),2);

        return Math.sqrt(lineABX + lineABY);
    }

    private double getWidth () {

        double lineBCX = Math.pow((pointC.getX() - pointB.getX()),2);
        double lineBCY = Math.pow((pointC.getY() - pointB.getY()),2);

        return Math.sqrt(lineBCX + lineBCY);

    }

    @Override
    public float getPerimeter() {
        double perRec = 2* (getLength() + getWidth());
        return (float) perRec;
    }

    @Override
    public float getArea() {
        double areaRec = getLength() * getWidth();
        return (float) areaRec;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
