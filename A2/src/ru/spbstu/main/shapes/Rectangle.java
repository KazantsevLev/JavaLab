package ru.spbstu.main.shapes;

public class Rectangle implements Polygon {
    private float width;
    private float height;
    private int angle;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        angle = 0;
    }

    public Rectangle(float width, float height, int angle) {
        this(width, height);
        this.angle = angle;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public int getRotation() {
        return angle;
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
