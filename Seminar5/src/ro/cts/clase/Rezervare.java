package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorativa;
    private String genMuzica;

    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScauneErg, boolean hasMasaDecorativa, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScauneErg = hasScauneErg;
        this.hasMasaDecorativa = hasMasaDecorativa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErg=").append(hasScauneErg);
        sb.append(", hasMasaDecorativa=").append(hasMasaDecorativa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
