package ru.avalon.java.dev.j10.labs.shapes;

public class PointImpl implements Point {

    private float x;
    private float y;

    public PointImpl(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
