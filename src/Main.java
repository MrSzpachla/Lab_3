import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        /* Nie zrobiłem tego ćwiczenia za pomocą tablic, bo nie rozumiałem za bardzo polecenia
        Tablice z tego co wiem mogą przechowywać tylko jeden typ zmiennej. A tworzenie trzech oddzielnych mija się troche z celem.
        Dlatego wykorzystałem listę tak jak to jest w przykładzie
         */
        List<Student> listastudentow = new ArrayList<>();

        Student student = new Student();
        student.Imie = "Damian";
        student.Nazwisko = "Nizinski";
        student.NrAlbumu = 12345;
        student.zdal = true;
        listastudentow.add(student);

        student = new Student();
        student.Imie = "Andrzej";
        student.Nazwisko = "Lipski";
        student.NrAlbumu = 56423;
        student.zdal = false;
        listastudentow.add(student);

        student = new Student();
        student.Imie = "Michal";
        student.Nazwisko = "Miska";
        student.NrAlbumu = 56431;
        student.zdal = true;
        listastudentow.add(student);

        System.out.println("Imie | " +  "Nazwisko | " +  "Album | Status");
        for (Student p : listastudentow) {
            System.out.println(p.Imie+ " | " + p.Nazwisko + " | " + p.NrAlbumu + " | " + p.zdal);
        }

    }
}

