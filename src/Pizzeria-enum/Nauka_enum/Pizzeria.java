import java.util.Arrays;
import java.util.Scanner;

public class Pizzeria {


    public static void main(){
        System.out.println("Dostępne pizze:");
        for(Pizza p:Pizza.values()) {
            System.out.println(p.name());
            }
        Scanner sc = new Scanner(System.in);
        Pizza pizza = Pizza.valueOf(sc.nextLine());
        System.out.println("Ale kozaczek brooo wybrałeś " + pizza);

        }
        }


