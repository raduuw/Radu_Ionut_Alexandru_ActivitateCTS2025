package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.setGenMuzica("Ambientala").build("Andrei");
        System.out.println(rezervare);
        Rezervare rezervare1=rezervareBuilder.setHasMasaDecorativa(true).build("Darius");
        System.out.println(rezervare1);
    }
}