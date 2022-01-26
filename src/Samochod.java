public class Samochod {
    protected String NrRej;
    private String Marka;
    private String Kolor;
    protected int Przebieg;

    public Samochod(String nrRej, String marka, String kolor, int przebieg) {
        NrRej = nrRej;
        Marka = marka;
        Kolor = kolor;
        Przebieg = przebieg;
    }
     @Override
         public String toString() {
             return  "Samochod: " +
                     "\nMarka: " + Marka +
                     "\nKolor: " + Kolor +
                     "\nPrzebieg: " + Przebieg +
                     "\nNr Rej: " + NrRej;

         }
}
