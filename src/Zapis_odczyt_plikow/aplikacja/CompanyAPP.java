import java.io.*;
import java.util.Scanner;

public class CompanyAPP {
    EmployeeAPP employee;
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "employees.info";

    public static void main() throws FileNotFoundException {
        String fileName = "person.obj";
        int option = scanner.nextInt();
        scanner.nextLine();
        if(option==1){
            MaxEmployee x =budowaFirmy();
            writeFile(x);
        }
        else if (option==2){
            System.out.println(readFile().toString());
        }
    scanner.close();
    }




    public static MaxEmployee readFile() throws FileNotFoundException {

        try(
                var fis = new FileInputStream(FILE_NAME);
                var ois = new ObjectInputStream(fis);
                )
        {
            return (MaxEmployee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(MaxEmployee company){
        try(
                var fis = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fis);
                )
        {
            oos.writeObject(company);
            System.out.println("Zapisano do pliku");
        }
        catch (IOException e){
            System.out.println("BLAD zapisu");
        }
    }
    public static MaxEmployee budowaFirmy(){
        MaxEmployee company = new MaxEmployee();
        for(int i=0; i<MaxEmployee.max ;i++){
            System.out.println("Podaj imie");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwikso");
            String lastName = scanner.nextLine();
            System.out.println("Podaj salary");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            company.add(new EmployeeAPP(firstName,lastName,salary));
        }
        return company;
    }
}
