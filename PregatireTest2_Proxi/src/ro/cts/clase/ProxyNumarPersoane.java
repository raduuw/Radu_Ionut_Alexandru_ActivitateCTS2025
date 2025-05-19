package ro.cts.clase;

public class ProxyNumarPersoane implements RezervareAbstract{
    private RezervareAbstract rezervare;

    public ProxyNumarPersoane(RezervareAbstract rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        if(numarPersoane>4){
            rezervare.rezervare(numeClient, numarPersoane, ora);
        }else{
            System.out.println("Nu e nevoie de rezervare");
        }
    }
}
