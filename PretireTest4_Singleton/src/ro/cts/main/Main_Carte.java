package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.CarteEager;

public class Main_Carte {
    public static void main(String[] args) {

        CarteEager carte1=CarteEager.getInstance();
        System.out.println(carte1);
        CarteEager carte2=CarteEager.getInstance();
        carte2.setNrPagini(60);
        System.out.println(carte2);
        System.out.println(carte1);
    }
}
