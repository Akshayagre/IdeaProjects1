import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        int r;
        Scanner s = new Scanner(System.in);

        System.out.println("radius of circle is:");
        r=s.nextInt();

        double A;

        A=3.14*r*r;

        System.out.println("Area of circle is:"+A);

    }
}
