import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        rectangle rect = new rectangle();
        Triangle tri = new Triangle();
        Rhombus rho = new Rhombus();
        square.squareAreaPeri();
        rect.rectAreaPeri();
        tri.triAreaPeri();
        rho.rhoAreaPeri();
    }
}