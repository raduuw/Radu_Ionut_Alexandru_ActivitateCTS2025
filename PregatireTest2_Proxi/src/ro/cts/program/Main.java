package ro.cts.program;


import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareAbstract;

public class Main {
    public static void main(String[] args) {
        RezervareAbstract rezervare=new Rezervare();
        rezervare.rezervare("Gigel", 5, 15);
        RezervareAbstract proxyNumarPersoane=new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezervare("Gigel", 3, 15);
        RezervareAbstract proxyOra = new ProxyOra(proxyNumarPersoane);
        proxyOra.rezervare("Gigel", 5, 20);

    }
}