public class Triangle {
    int length = 5;

    public void triAreaPeri(){
        System.out.println(triArea());
        System.out.println(triPerimeter());
    }
    public String triArea(){
        return ("Triangle " + length + " x " + length + " feet area " + (length * length)/2);
    }
    public String triPerimeter(){
        return ("Triangle " + length + " x " + length + " feet Perimeter " + (Math.sqrt(length*length + length*length) + length*2));
    }
}
