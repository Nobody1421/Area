public class rectangle{
    int length = 5;
    int height = 10;
    public void rectAreaPeri(){
        System.out.println(rectArea());
        System.out.println(rectPerimeter());
    }
    public String rectArea(){
        return ("Rectangle " + length + " x " + height + " feet area " + length * height);
    }
    public String rectPerimeter(){
        return ("Rectangle " + length + " x " + length + " feet Perimeter " + (length * 2) * 2);
    }
}
