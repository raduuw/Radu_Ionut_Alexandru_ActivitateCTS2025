package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Service service=Service.getInstance();

        AMasina masina1 = new SUV("X5", "BMW");
        AMasina masina2 = new VAN("T5", "Volkswagen");
        AMasina masina3 = new SEDAN("Civic", "Honda");
        AMasina masina4 = new SUV("Q7", "Audi");

        service.adaugaMasinaInService(masina1);
        service.adaugaMasinaInService(masina2);
        service.elibereazaService();
        service.adaugaMasinaInService(masina2);
    }
}