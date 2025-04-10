package Rezervare.clase;

public class RezervareInterior extends AbstractRezervare{

    private boolean esteLaParter;

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int zi, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, zi);
        this.esteLaParter = esteLaParter;
    }

    public RezervareInterior(){
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareInterior rezervare=new RezervareInterior();
        rezervare.esteLaParter=this.esteLaParter;
        rezervare.zi=ziua;
        rezervare.nrParticipanti=this.nrParticipanti;
        rezervare.numeClient=this.numeClient;
        rezervare.ora=this.ora;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
