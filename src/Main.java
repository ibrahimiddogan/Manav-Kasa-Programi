import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma =3.67,domates =1.11,muz=0.95,patlican=5;
        double total;
        Scanner alici = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        armut *= alici.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elma *= alici.nextDouble();
        System.out.print("domates kaç kilo : ");
        domates *= alici.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muz *= alici.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        patlican *= alici.nextDouble();
        total = armut+elma+domates+muz+patlican;
        System.out.println("Ödemeniz gereken tutar : " +total);

    }
}