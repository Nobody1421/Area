import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        rectangle rect = new rectangle();
        System.out.println(square.squareArea());
        System.out.println(square.squarePerimeter());
        System.out.println(rect.rectArea());
        System.out.println(rect.rectPerimeter());
    }
}