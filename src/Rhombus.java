public class Rhombus {
    int length = 5;

    public void rhoAreaPeri(){
        System.out.println(rhoArea());
        System.out.println(rhoPerimeter());
    }
    public String rhoArea(){
        return ("Rhombus " + length + " x " + length + " feet area " + (length * length)/2);
    }
    public String rhoPerimeter(){
        return ("Rhombus " + length + " x " + length + " feet Perimeter " + length*4);
    }
}
