package Farmacie.main;

import Banca.clase.Cont;
import Banca.clase.ContBuilder;
import Farmacie.clase.Reteta;
import Farmacie.clase.RetetaBuilder;

public class Main {
    public static void main(String[] args) {
        RetetaBuilder retetaBuilder=new RetetaBuilder();
        Reteta reteta=retetaBuilder.setaPlatitCuCardul(true).builde("1234");
        System.out.println(reteta);

        Reteta reteta1=retetaBuilder.setAreCardFidelitate(true).builde("3232");
        System.out.println(reteta1);
    }
}