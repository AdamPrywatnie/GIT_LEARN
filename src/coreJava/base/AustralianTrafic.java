import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class AustralianTrafic implements CentralTraffic {


    public static void main(String[] args){
        CentralTraffic a = new AustralianTrafic();
        a.goGreen();
        a.stopRed();
        a.waitYellow();
    }

    @Override
    public void goGreen() {
        System.out.println("Zielone");
    }

    @Override
    public void stopRed() {
        System.out.println("czerwony");
    }


    @Override
    public void waitYellow() {
        System.out.println("żółty");
    }
}
