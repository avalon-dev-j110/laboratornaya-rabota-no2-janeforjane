package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private PointImpl pointA;
    private PointImpl pointB;
    private PointImpl pointC;


    public Triangle (PointImpl pointA, PointImpl pointB, PointImpl pointC) {

        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

    }

    private double getSideAB () {

        double lineABX = Math.pow((pointB.getX() - pointA.getX()),2);
        double lineABY = Math.pow((pointB.getY() - pointA.getY()),2);

        return Math.sqrt(lineABX + lineABY);
    }

    private double getSideBC () {

        double lineBCX = Math.pow((pointC.getX() - pointB.getX()),2);
        double lineBCY = Math.pow((pointC.getY() - pointB.getY()),2);

        return Math.sqrt(lineBCX + lineBCY);
    }

    private double getSideCA() {

        double lineCAX = Math.pow((pointA.getX() - pointC.getX()),2);
        double lineCAY = Math.pow((pointA.getY() - pointC.getY()),2);

        return Math.sqrt(lineCAX + lineCAY);

    }

    private double getPerTri (){

        return getSideAB() + getSideBC() + getSideCA();

    }

    @Override
    public float getPerimeter() {
        return (float) getPerTri ();
    }

    @Override
    public float getArea() { //формула площади треугольника по трем сторонам
        double halfPerTri = getPerTri () / 2;
        return (float) Math.sqrt(halfPerTri * (halfPerTri - getSideAB()) * (halfPerTri - getSideBC()) * (halfPerTri - getSideCA()));
    }


    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
