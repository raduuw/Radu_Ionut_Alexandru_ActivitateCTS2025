package ro.cts.clase;

public class ProxyOra implements RezervareAbstract{
    private RezervareAbstract rezerva;

    public ProxyOra(RezervareAbstract rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        if(ora>=18){
            this.rezerva.rezervare(numeClient, numarPersoane, ora);
        }else{
            System.out.println("Nu este nevoie de rezervare");
        }
    }
}
