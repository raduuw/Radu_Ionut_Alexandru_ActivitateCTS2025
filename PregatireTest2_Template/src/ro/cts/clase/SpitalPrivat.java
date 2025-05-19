package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare{

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradfDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Avem paturi suficiente");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("pt pacientul " + pacient.getNume()+ " a fost emisa fisa de internare");
    }
}
