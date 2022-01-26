public class Ciezarowy extends Samochod{
    private int Ladownosc;
    protected String Ladunek;
    private int Obciazenie;

    public Ciezarowy(String nrRej, String marka, String kolor, int przebieg, int ladownosc, String ladunek, int obciazenie) {
        super(nrRej, marka, kolor, przebieg);
        Ladownosc = ladownosc;
        Ladunek = ladunek;
        Obciazenie = obciazenie;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "\nTyp: Ciezarowy" +
                "\nLadownosc: " + Ladownosc +
                "\nLadunek: " + Ladunek +
                "\nObiciazenie: " + Obciazenie;
    }
}
