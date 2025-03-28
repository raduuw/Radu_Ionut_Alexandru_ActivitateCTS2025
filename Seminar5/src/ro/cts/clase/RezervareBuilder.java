package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder{

    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorativa;
    private String genMuzica;

    public RezervareBuilder(){
        hasMasaDecorativa=false;
        hasAsezareGeam=false;
        hasScauneErg=false;
        genMuzica="faraMuzica";
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public RezervareBuilder setHasScauneErg(boolean hasScauneErg) {
        this.hasScauneErg = hasScauneErg;
        return this;
    }

    public RezervareBuilder setHasMasaDecorativa(boolean hasMasaDecorativa) {
        this.hasMasaDecorativa = hasMasaDecorativa;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }



    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, hasAsezareGeam, hasMasaDecorativa, hasScauneErg, genMuzica );
    }
}
