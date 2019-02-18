package lesson_13;

//public class Rectangle implements Shape {

//поскольку Shape стал классом то наследование происходит с помощью ключевого слова extends
public class Rectangle extends Shape {
    private double height;
    private double width;
    // private String color;

    //определяем параметры прямоугольника в конструкторе
    // public Rectangle(double h, double w, String c) {
    public Rectangle(double h, double w) {
	super("Blue");
	height = h;
	width = w;
	// color = c;
    }

    public String getName() {
	return "Ractangle";
    }

    @Override
    public double getSquare() {
	return height * width;
    }

    /*
     * @Override public String getColor() { return color; }
     */

}
