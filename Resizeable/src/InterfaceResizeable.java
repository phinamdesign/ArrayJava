public class InterfaceResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println("Hình tròn");
        circle.getAre();
        circle.resize(5);
        System.out.println();

        Rectangle rectangle = new Rectangle(12,6);
        System.out.println("Hình chữ nhật");
        rectangle.getAre();
        rectangle.resize(5);
        System.out.println();

        Square square = new Square(12);
        System.out.println("Hình tròn");
        square.getAre();
        square.resize(5);
        System.out.println();

    }
}
