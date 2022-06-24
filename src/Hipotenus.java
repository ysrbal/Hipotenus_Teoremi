import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, cevre, alan, u;

        System.out.print("A Kenarini Giriniz :");
        a = input.nextDouble();

        System.out.print("B Kenarini Giriniz :");
        b = input.nextDouble();

        System.out.print("C Kenarini Giriniz :");
        c = input.nextDouble();

        u= (a+b+c)/2;
        cevre=2*u;
        alan= Math.sqrt(((u)*(u-a)*(u-b)*(u-c)));

        System.out.println("CEVRE :" + cevre + " metre");
        System.out.println("ALAN :" + alan + " metrekare");









    }
}
