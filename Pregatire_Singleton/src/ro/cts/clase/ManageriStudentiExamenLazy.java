package ro.cts.clase;

public class ManageriStudentiExamenLazy {
    private String sesiune;
    private String universitate;
    private int nrExameneInregistrate;

    private static ManageriStudentiExamenLazy instance=null;

    private ManageriStudentiExamenLazy(String sesiune, String universitate, int nrExameneInregistrate) {
        this.sesiune = sesiune;
        this.universitate = universitate;
        this.nrExameneInregistrate = nrExameneInregistrate;
    }

    public static synchronized ManageriStudentiExamenLazy getInstance(String sesiune, String universitate){
        if(instance==null){
            instance=new ManageriStudentiExamenLazy(sesiune, universitate, 0);
        }
        return instance;
    }

    public void inregistreazaExamen(String student, String materie) {
        nrExameneInregistrate++;
        System.out.println("✅ " + student + " s-a înregistrat la examenul de " + materie);
    }

    public String getUniversitate() {
        return universitate;
    }

    public int getNrExameneInregistrate() {
        return nrExameneInregistrate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManageriStudentiExamenLazy{");
        sb.append("sesiune='").append(sesiune).append('\'');
        sb.append(", universitate='").append(universitate).append('\'');
        sb.append(", nrExameneInregistrate=").append(nrExameneInregistrate);
        sb.append('}');
        return sb.toString();
    }
}
