public class Circle implements metodaObiekty {
    private double R;
public Circle(double R){
    this.R=R;
}
    @Override
    public double getArea() {
        return (pi*R*R)/2;
    }

    @Override
    public double obwód() {
        return 2*pi*R;
    }
}

