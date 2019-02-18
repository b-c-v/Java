package lesson_13;

//если мы наследуемся от интерфейса пишем implements. Наследуем класс Круг от интерфейса Формы
//public class Circle implements Shape {

//поскольку Shape стал классом то наследование происходит с помощью ключевого слова extends
public class Circle extends Shape {
    private double radius;
    // private String color;

    // заполняем радиус в конструкторе
    // public Circle(double r, String c) {

    public Circle(double r) {
	//2 в конструкторе класса-наследника передаем цвет. Super это ссылка на метод базового класса
	super("Red");
	radius = r;
	//color = c;
    }

    public String getName() {
	return "Circle";
    }

    // вычисляем площадь круга
    public double getSquare() {
	return 3.1415926 * radius * radius;
    }

    /*
     * public String getColor() { return color;
     * 
     * }
     */

}
