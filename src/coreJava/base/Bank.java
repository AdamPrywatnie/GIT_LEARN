public class Bank {
}

public static void main(String[] args) {
    Person person = new Person();
    person.name="zbychu";
    person.lastName="Grodek";
    person.pesel="696969";
    BankAccount account1= new BankAccount();
    account1.owner=person;
    account1.money=19993;
    Credit kredycik = new Credit();
    kredycik.borrower=person;
    kredycik.borrowedMoney=5345445;
    kredycik.monthlyRate=1600;
    kredycik.returedMoney=23233;
}
