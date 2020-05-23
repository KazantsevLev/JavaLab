package ru.spbstu.main.shapes;

public class Triangle implements Shape, Polygon {
    private Point point1, point2, point3;
    private int angle;
    private double a, b, c;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        angle = 0;
        CalcLength();
    }

    public Triangle(Point point1, Point point2, Point point3, int angle) {
        this(point1, point2, point3);
        this.angle = angle;
    }

    private void CalcLength() {
        double a = Math.sqrt(Math.abs(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2)));
        double b = Math.sqrt(Math.abs(Math.pow(point1.getX() - point3.getX(), 2) + Math.pow(point1.getY() - point3.getY(), 2)));
        double c = Math.sqrt(Math.abs(Math.pow(point2.getX() - point3.getX(), 2) + Math.pow(point2.getY() - point3.getY(), 2)));
    }

    @Override
    public float getArea() {
        double pp = getPerimeter() / 2;

        return (float) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public int getRotation() {
        return angle;
    }

    @Override
    public float getPerimeter() {
        return (float) (a + b + c);
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
