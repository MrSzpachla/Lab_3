public class Parametry extends Ciezarowy{
    private int Predkosc;
    private int tempol;
    private int poziompaliwa;

    public Parametry(String nrRej, String marka, String kolor, int przebieg, int ladownosc, String ladunek, int obciazenie, int predkosc, int tempol, int poziompaliwa) {
        super(nrRej, marka, kolor, przebieg, ladownosc, ladunek, obciazenie);
        Predkosc = predkosc;
        this.tempol = tempol;
        this.poziompaliwa = poziompaliwa;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "\nPredkosc: " + Predkosc +
                " km/h\nTemperatura Oleju: " + tempol +
                " c\nPoziom paliwa: " + poziompaliwa + " %";
    }
}
