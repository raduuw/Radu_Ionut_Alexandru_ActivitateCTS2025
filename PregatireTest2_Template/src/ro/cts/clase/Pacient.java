package ro.cts.clase;

public class Pacient {
    private String nume;
    private int gradfDificultate;

    public Pacient(String nume, int gradfDificultate) {
        this.nume = nume;
        this.gradfDificultate = gradfDificultate;
    }

    public String getNume() {
        return nume;
    }

    public int getGradfDificultate() {
        return gradfDificultate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gradfDificultate=").append(gradfDificultate);
        sb.append('}');
        return sb.toString();
    }
}
