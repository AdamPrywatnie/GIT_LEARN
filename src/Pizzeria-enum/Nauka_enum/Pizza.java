public enum Pizza {
    MARGHERITA(true,true,false,false),
    CAPRICIOS(true,true,false,true),
    PROSCIUTTO(true,true,true,false);

    private final boolean sosPomidorowy;
    private final boolean ser;
    private final boolean szynka;
    private final boolean pieczarki;

    private Pizza(boolean sosPomidorowy,boolean ser,boolean szynka,boolean pieczarki){
        this.sosPomidorowy=sosPomidorowy;
        this.ser=ser;
        this.szynka=szynka;
        this.pieczarki=pieczarki;
    }
    @Override
    public String toString() {
        String result = name() + " (";
        if(sosPomidorowy)
            result +="sos pomidorowy";
        if(ser)
            result+=",ser";
        if(szynka)
            result+=",szynka";
        if(pieczarki)
            result+=",pieczarki";
        return result+= ")";

    }

}
