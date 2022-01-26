import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        List<Samochod> lista_pojazdow = new ArrayList<>();

        Parametry p1 = new Parametry("GDA14245","MAN","Czerwony",23453,18000,"Ryby",16220,90,95,40);
        Parametry p2 = new Parametry("GDA45897","MAN","Niebieski",123457,18000,"Gres",17890,110,45,89);
        Ciezarowy p3 = new Ciezarowy("GDA44586","VOLVO","Srebrny",45441,18000,"Palety",15420);
        Ciezarowy p4 = new Ciezarowy("GDA88746","MAN","Czerwony",584450,18000,"Elektronika",0);
        Samochod p5 = new Samochod("GDA98854","SCANIA","Zielony",99459);
        lista_pojazdow.add(p1);
        lista_pojazdow.add(p2);
        lista_pojazdow.add(p3);
        lista_pojazdow.add(p4);
        lista_pojazdow.add(p5);
        System.out.println(lista_pojazdow.toString());
    }
}
