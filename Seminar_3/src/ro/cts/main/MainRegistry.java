package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args){
        Autoritate autoritate1=Autoritate.getInstance("Autoritate1", "www.autoritate1.com");
        Reglementare reglementare1=autoritate1.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2=autoritate1.reglementeazaModel("Tesla CyberTruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3=autoritate1.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);
    }
}
