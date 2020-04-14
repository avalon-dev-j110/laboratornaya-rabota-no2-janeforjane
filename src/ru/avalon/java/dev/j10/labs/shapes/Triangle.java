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


    private double sideAB;
    private double sideBC;
    private double sideCA;

    private double perTri;

    public Triangle (PointImpl pointA, PointImpl pointB, PointImpl pointC) {
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
        double lineCAX = Math.pow((pointAX - pointCX),2);
        double lineCAY = Math.pow((pointAY - pointCY),2);


        sideAB = Math.sqrt(lineABX + lineABY); //длина стороны по формуле вычисления расстояния между двумя
        sideBC = Math.sqrt(lineBCX + lineBCY); //точками на плоскости
        sideCA = Math.sqrt(lineCAX + lineCAY);

        perTri = sideAB + sideBC + sideCA;

    }


    @Override
    public float getPerimeter() {
        float perTri2 = (float) perTri ;
        return perTri2;
    }

    @Override
    public float getArea() { //формула площади треугольника по трем сторонам
        double halfPerTri = perTri / 2;
        double areaTri = Math.sqrt(halfPerTri * (halfPerTri - sideAB) * (halfPerTri - sideBC) * (halfPerTri - sideCA));
        float areaTri2 = (float) areaTri;
        return areaTri2;
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
