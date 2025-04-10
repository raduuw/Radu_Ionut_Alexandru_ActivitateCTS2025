package Rezervare.main;


import Rezervare.clase.AbstractRezervare;
import Rezervare.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareTerasa=new RezervareTerasa(12, 21, "Laur", 5, true);
        AbstractRezervare rezervareTerasa1=rezervareTerasa.copiaza(8);
        AbstractRezervare rezervareTerasa2=rezervareTerasa1.copiaza(30);

        System.out.println(rezervareTerasa);
        System.out.println(rezervareTerasa1);

        rezervareTerasa2.setZi(23);
        System.out.println(rezervareTerasa2.toString());

    }
}