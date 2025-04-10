package ro.cts.main;

import ro.cts.clase.CarteEager;
import ro.cts.clase.ConexiuneEager;

public class Main_Conexiune {
    public static void main(String[] args) {

        ConexiuneEager conexiune1=ConexiuneEager.getInstance();
        System.out.println(conexiune1);
        ConexiuneEager conexiune2=ConexiuneEager.getInstance();
        conexiune1.setNrTabele(4);
        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}
