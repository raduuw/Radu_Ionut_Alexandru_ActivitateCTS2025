package ro.cts.clase;

public class SpitalPublic extends  TemplateInternare{
    private String nume;

    public SpitalPublic(String nume) {
        this.nume = nume;
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Nu avem paturi in spitalul " +this.nume);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()+ " a fost transferat la alt spital");
    }
}
