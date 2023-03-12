import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r;
        double a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez açısını giriniz: ");
        a = inp.nextDouble();


        double alan = (pi * (r *r) * a) / 360.0;

        System.out.println("Dilim Alanı : " + alan);







    }
}
