package ro.cts.clase;

public class ManageriStudentiExamenEager {
    private String sesiune;
    private String universitate;
    private int nrExameneInregistrate;

    private static final ManageriStudentiExamenEager instance = new ManageriStudentiExamenEager("Iarna", "Universitatea Tehnica", 4);

    private ManageriStudentiExamenEager(String sesiune, String universitate, int nrExameneInregistrate) {
        this.sesiune = sesiune;
        this.universitate = universitate;
        this.nrExameneInregistrate = nrExameneInregistrate;
    }

    public void inregistreazaExamen(String student, String materie) {
        System.out.println("✅ " + student + " a fost înregistrat la examenul de " + materie);
        nrExameneInregistrate++;
    }

    public void setUniversitate(String universitate) {
        this.universitate = universitate;
    }

    public String getUniversitate() {
        return universitate;
    }

    public int getNrExameneInregistrate() {
        return nrExameneInregistrate;
    }

    public static ManageriStudentiExamenEager getInstance() {
        return instance;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManageriStudentiExamenEager{");
        sb.append("sesiune='").append(sesiune).append('\'');
        sb.append(", universitate='").append(universitate).append('\'');
        sb.append(", nrExamene=").append(nrExameneInregistrate);
        sb.append('}');
        return sb.toString();
    }
}
