package ro.cts.program;

import ro.cts.clase.FabricaPacient;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPacient fabricaPacient=new FabricaPacient();
        PacientAbstract pacientAbstract=fabricaPacient.getPacient("Ion", "0732313422", "ion@gmail.com");
        Spitalizare spitalizare1=new Spitalizare(5, 7, 3);
        Spitalizare spitalizare2=new Spitalizare(2, 5, 6);
        Spitalizare spitalizare3= new Spitalizare(7, 4, 5);
        Spitalizare spitalizare4=new Spitalizare(8, 4, 2);

        pacientAbstract.afiseazaPacient(spitalizare1);
        pacientAbstract.afiseazaPacient(spitalizare2);

        fabricaPacient.getPacient("Ioana", "0732456343", "ioana@gmail.com").afiseazaPacient(spitalizare3);
        fabricaPacient.getPacient("0732313422").afiseazaPacient(spitalizare4);
    }
}
