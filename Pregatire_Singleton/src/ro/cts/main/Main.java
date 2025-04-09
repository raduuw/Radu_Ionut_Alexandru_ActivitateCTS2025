package ro.cts.main;

import ro.cts.clase.ManageriStudentiExamenEager;
import ro.cts.clase.ManageriStudentiExamenLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("===== EAGER SINGLETON =====");
        ManageriStudentiExamenEager eager=ManageriStudentiExamenEager.getInstance();
        eager.inregistreazaExamen("Ion Popescu", "CTS");
        eager.inregistreazaExamen("Maria Ionescu", "POO");
        System.out.println(eager);

        System.out.println("\n===== LAZY SINGLETON =====");
        ManageriStudentiExamenLazy lazy=ManageriStudentiExamenLazy.getInstance("Iarna", "UTCB");
        lazy.inregistreazaExamen("Andrei Pop", "CTS");
        lazy.inregistreazaExamen("Elena Stan", "POO");
        System.out.println(lazy);
    }
}