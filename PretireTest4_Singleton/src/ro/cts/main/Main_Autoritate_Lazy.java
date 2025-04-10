package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main_Autoritate_Lazy {
    public static void main(String[] args) {
    AutoritateReglementareMasiniLazy autoritate1=AutoritateReglementareMasiniLazy.getInstance("autoritate1", "www.autoritate.ro");
    System.out.println(autoritate1);
    AutoritateReglementareMasiniLazy autoritate2=AutoritateReglementareMasiniLazy.getInstance("autoritate1", "www.sitenou.ro");
    System.out.println(autoritate2);
    System.out.println(autoritate1);

    autoritate2.reglementeazaMasini("autoritate1");
    System.out.println(autoritate2);
    System.out.println(autoritate1);

    }

}
