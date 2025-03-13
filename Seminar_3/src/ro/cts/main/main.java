package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class main {
    public static void main(String[] args){
        AutoritateReglementareMasiniEager autoritate=AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritat2=AutoritateReglementareMasiniEager.getInstance();
        autoritat2.setWebsite("www.autoritate2.com");
        System.out.println(autoritat2);

        System.out.println(autoritate);

        autoritat2.regelementariModel("Dacia Logan");
        System.out.println(autoritat2);
        AutoritateReglementareMasiniLazy  autoritate3=AutoritateReglementareMasiniLazy.getInstance("autoritateLazy1", "www.autoritateLazy1.com");
        AutoritateReglementareMasiniLazy autoritate4=AutoritateReglementareMasiniLazy.getInstance("autoritateLazy2","www.autoritateLazy2.com");

        System.out.println(autoritate3);
        System.out.println(autoritate4);
    }
}
