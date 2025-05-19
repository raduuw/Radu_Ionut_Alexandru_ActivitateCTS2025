package ro.cts.clase;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private int oraRezervarii;

    public Rezervare(int numarMasa, int numarPersoane, int oraRezervarii) {
        super();
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervarii = oraRezervarii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", oraRezervarii=").append(oraRezervarii);
        sb.append('}');
        return sb.toString();
    }
}
