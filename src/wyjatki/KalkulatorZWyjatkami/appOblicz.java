import java.util.InputMismatchException;
import java.util.Scanner;

public class appOblicz {
    public static void main(){
        String figura="brak";
        Scanner sc = new Scanner(System.in);
        double promien;
        double a;
        double b;

        boolean warunekPetli=false;
        while (!warunekPetli) try {
            System.out.println("Zdecyduj jaka figura Cię interesuje - K lub P");
            figura = sc.nextLine();
            if (figura.equals("K")) {
                System.out.println("Podaj jaki ma mieć promień");
                promien = sc.nextDouble();
                sc.nextLine();
                Circle circle = new Circle(promien);
                System.out.println("Ppowierzchnia kola "+ circle.getArea());
                warunekPetli = true;
            } else if (figura.equals("P")) {
                System.out.println("Podaj jaki ma mieć pierwszy bok");
                a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj jaki ma mieć drugi bok");
                b = sc.nextDouble();
                sc.nextLine();
                Rectangle rect = new Rectangle(a, b);
                System.out.println("Ppowierzchnia prostokata "+ rect.obwód());
                warunekPetli = true;
            } else
                System.out.println("podałeś zły parametr " + figura);
        } catch (InputMismatchException e) {
            System.out.println("podałeś zły typ danych " + e);
        }

    }

}
