package ro.cts.model.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti=new ArrayList<>();
        studenti.add(new Student("Mihai", 20, 1, 900));
        studenti.add(new Student("Ana", 20, 2, 800));

        Curs curs=new Curs("CTS", 4, new Profesor("Adrian", 40, 30, 4000, 0.35f), studenti);
        curs.sustineExamen("05/06/2025");

        curs.getProfesor().preda();
        System.out.println("Venitul profesorului: " + ((Persoana)curs.getProfesor()).calculareVenit());
        curs.setProfesor(new Asistent("Popescu", 45, 20, 4000f));
        curs.sustineExamen("10/06/2025");

        Lector lector=new Lector("Vasile", 50);
        lector.preda();
        curs.setProfesor(new Lector("Dorin", 40));
        curs.sustineExamen("09/06/2025");
    }
}