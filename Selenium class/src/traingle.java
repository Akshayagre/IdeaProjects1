public class traingle {
    public static void main(String[] args) {

        int a=45;
        int b=45;
        int c=90;

        if (a+b+c==180 && a>0 && b>0 && c>0)
        {
            System.out.println("it is a triangle");

            if (a==b && b==c)
                System.out.println("Equilateral");
            if (a==90 || b==90 || c==90)
                System.out.println("it is right angle traingle");
            if (a!=b && b!=c && c!=a )
                System.out.println("it is scelene triangle");
            if (a==b && c!=a || b==c && a!=b || c==a && b!=a)
                System.out.println("it is a Isosceles triangle");
        }
        else
        System.out.println("this is not a triangle");
    }

}
