import java.util.Scanner;

class AreaofRectangleimport {

    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter value of length:");
        x=S.nextInt();

        System.out.println("Enter value of width:");
        y=S.nextInt();

        z=x*y;

        System.out.println("Area of rectangle is:"+z);

    }
}
