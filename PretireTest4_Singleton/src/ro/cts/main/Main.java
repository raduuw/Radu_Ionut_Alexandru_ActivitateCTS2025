package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;

public class Main {
    public static void main(String[] args) {

        AutoritateReglementareMasiniEager autoritate1=AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate1);
        AutoritateReglementareMasiniEager autoritate2=AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.websitenou.ro");
        System.out.println(autoritate2);
        System.out.println(autoritate1);

        autoritate1.reglementeazaMasini("Autoritate1");
        System.out.println(autoritate1);
        System.out.println(autoritate2);
    }
}