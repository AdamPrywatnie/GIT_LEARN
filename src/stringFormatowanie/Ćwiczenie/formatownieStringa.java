import java.sql.Array;
import java.util.Scanner;

public class formatownieStringa
{

    public static void main(){
        StringBuilder wynik = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile chcesz nadac wyrazow");
        int x = sc.nextInt();
        sc.nextLine();
        String[] rozneWejscia = new String[x];
        for(int i=0;i<x;i++){
            System.out.println("Podaj wyraz");
            rozneWejscia[i]=sc.nextLine();
            wynik.append(rozneWejscia[i].charAt(rozneWejscia[i].length()-1));
        }
        System.out.println(wynik);
    }

}
