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

        Student[] obj = new Student[4];
        obj[1] = new Student( "Damian" , "Nizinski" , 12345 , true );
        obj[2] = new Student( "Arnold" , "Maczka" , 542878 , false );
        obj[3] = new Student( "Maciek" , "Lipka" , 77785 , true );

        for(int i = 1; i <= 3; i++)
        {
            System.out.println(obj[i].Imie+ " | " + obj[i].Nazwisko + " | " + obj[i].NrAlbumu + " | " + obj[i].zdal);
        }


    }
}

