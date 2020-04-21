package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {


    private PointImpl center;
    private PointImpl pointOnCircle;


    public Circle (PointImpl center, PointImpl pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;

    }

    private double getRad (){

        double lineX = Math.pow((pointOnCircle.getX() - center.getX()),2);
        double lineY = Math.pow((pointOnCircle.getY() - center.getY()),2);

        return Math.sqrt(lineX + lineY);
    }


    @Override
    public float getLength() {

        double lenCircle = getRad() * 2 * Math.PI;
        return (float) lenCircle;
    }

    @Override
    public float getArea() {

        double areaCircle = Math.pow(getRad(), 2)* Math.PI;
        return (float) areaCircle;
    }


    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
