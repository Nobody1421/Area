public class Square{
    int length = 5;
    public void squareAreaPeri(){
        System.out.println(squareArea());
        System.out.println(squarePerimeter());
    }
    public String squareArea(){
        return ("Square " + length + " x " + length + " feet area " + length * length);
    }
    public String squarePerimeter(){
        return ("Square " + length + " x " + length + " feet Perimeter " + (length * 4));
    }
}
