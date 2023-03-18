import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(Square(length));
    }
    public static int Square(int length){
        return length * length;
    }
}