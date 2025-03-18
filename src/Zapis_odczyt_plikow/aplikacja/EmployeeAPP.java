import java.io.Serializable;

public class EmployeeAPP extends PersonAPP implements Serializable {
    private double wyplata;

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public EmployeeAPP(String name, String surrname, double wyplata) {
        super(name, surrname);
        this.wyplata=wyplata;
    }
    @Override
    public String toString(){
        return super.toString() + "wypłata " + wyplata + "zł";
    }
}
