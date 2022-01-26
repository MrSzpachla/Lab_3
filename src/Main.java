import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Osoba
    {
        private String imie;
        private String Nazwisko;
        private int indeks;


        public Osoba(String imie, String Nazwisko, int indeks) {
            this.imie= imie;
            this.Nazwisko = Nazwisko;
            this.indeks = indeks;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return Nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            Nazwisko = nazwisko;
        }

        public int getIndeks() {
            return indeks;
        }

        public void setIndeks(int indeks) {
            this.indeks = indeks;
        }
        public void wypisz()
        {
            System.out.printf("Imie : %s \n Naziwko: %s \n Indeks: %d \n",imie,Nazwisko,indeks);
        }
    }

    static class Student
    {
        private Osoba osoba;
        private WydzialEnum wydzial;

        public Student(Osoba osoba, WydzialEnum wydzial) {
            this.osoba = osoba;
            this.wydzial = wydzial;
        }

        public Osoba getOsoba() {
            return osoba;
        }

        public void setOsoba(Osoba osoba) {
            this.osoba = osoba;
        }

        public WydzialEnum getWydzial() {
            return wydzial;
        }

        public void setWydzial(WydzialEnum wydzial) {
            this.wydzial = wydzial;
        }
        @Override
        public String toString() {
            return "Student:" +
                    "\nImie: " + osoba.imie +
                    "\nNazisko: " + osoba.Nazwisko +
                    "\nindeks: " + osoba.indeks +
                    "\nWydzial: " + wydzial +
                    "\nKolor: " + wydzial.s1+
                    "\nTryb: " + wydzial.s2+
                    "\nNumer: " + wydzial.d3+
                    "\n\n";
        }
    }

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */



        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        List<Student> listastudentow = new ArrayList<>();
        Student student1 = new Student( new Osoba("Mirek","Lind",12345), WydzialEnum.Ekonmia );
        Student student2 = new Student( new Osoba("Arnold","Boczek",54879), WydzialEnum.Inforamtyka );
        Student student3 = new Student( new Osoba("Jozef","Szymanski",74415), WydzialEnum.Inforamtyka );
        Student student4 = new Student( new Osoba("Nikola","Sokolowska",74885), WydzialEnum.Rachunkowosci );
        Student student5 = new Student( new Osoba("Aneta","Szymanska",33648), WydzialEnum.Rachunkowosci );
        listastudentow.add(student1);
        listastudentow.add(student2);
        listastudentow.add(student3);
        listastudentow.add(student4);
        listastudentow.add(student5);

        System.out.println(listastudentow.toString());
    }
}
