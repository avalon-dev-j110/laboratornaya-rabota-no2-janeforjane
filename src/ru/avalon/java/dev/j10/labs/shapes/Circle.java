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


    private double rad;
    private double pi;

    public Circle (PointImpl center, PointImpl pointOnCircle) {
        double centerX = center.getX();
        double centerY = center.getY();
        double pointOnCircleX = pointOnCircle.getX();
        double pointOnCircleY = pointOnCircle.getY();

        double lineX = Math.pow((pointOnCircleX - centerX),2);
        double lineY = Math.pow((pointOnCircleY - centerY),2);


        rad = Math.sqrt(lineX + lineY);

    }


    public void setRad(float rad) {
        this.rad = rad;
    }

    @Override
    public float getLength() {
        pi = Math.PI;
        double lenCircle = rad * 2 * pi;
        float lenCircle2 = (float) lenCircle;
        return lenCircle2;
    }

    @Override
    public float getArea() {

        double areaCircle = Math.pow(rad, 2)* Math.PI;
        float areaCircle2 = (float) areaCircle;
        return areaCircle2;
    }




    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
