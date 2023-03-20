public class Square{
    int length = 5;
    public String squareArea(){
        return ("Square " + length + " x " + length + " feet area " + length * length);
    }
    public String squarePerimeter(){
        return ("Square " + length + " x " + length + " feet Perimeter " + (length * 2) * 2);
    }
}
