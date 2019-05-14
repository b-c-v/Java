package com.bcv.lessons.epam.circle;
/*1. Создать класс "Окружность".

        Класс должен иметь следующие поля:
        1) x, y - координаты центра окружности;
        2) radius - радиус окружности.

        Класс должен иметь следующие методы:
        1) передвинуть окружность на dx и dy;
        2) проверить попадание заданной точки внутрь данной окружности;
        3) проверить попадание другой окружности внутрь данной;
        4) вывести на экран параметры окружности.*/

public class Circle {

    private double x, y, radius;

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void moveCircle(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    void dotInsideCircle(double dotX, double dotY) {

        if (Math.pow((dotX - x), 2) + Math.pow((dotY - y), 2) <= Math.pow(radius, 2)) {
            System.out.println("Dot inside circle formula");
        } else {
            System.out.println("Dot outside circle formula");
        }
    }

    void circleInside(Circle secondCircle) {
    double lengthBetweenCenters = Math.sqrt(Math.pow ((secondCircle.x -this.x), 2) + Math.pow((secondCircle.y-this.y),2));
        if (lengthBetweenCenters <= (secondCircle.radius + this.radius)) {
            System.out.println("Окружности пересекаются");
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }



    public static void main(String[] args) {
        Circle circle = new Circle(15, 5, 5);
        System.out.println(circle.toString());
        circle.dotInsideCircle(25, 10);
        circle.circleInside(new Circle(10,10,10));
        System.out.println(circle.toString());
    }
}
