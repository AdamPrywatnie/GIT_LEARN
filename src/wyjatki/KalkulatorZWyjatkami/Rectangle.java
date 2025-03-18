public class Rectangle implements metodaObiekty{

    private double a;
    private double b;
    public Rectangle(double bok1,double bok2){
        this.a=bok1;
        this.b=bok2;
    }
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double obwód() {
        return 2*a+2*b;
    }
}
