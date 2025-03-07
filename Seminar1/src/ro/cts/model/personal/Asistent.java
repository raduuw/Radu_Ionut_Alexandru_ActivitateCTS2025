package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {

    private int id;
    private float salariu;

    public Asistent(String nume, int varsta, int id, float salariu) {
        super(nume, varsta);
        this.id = id;
        salariu = salariu;
    }

    public int getId() {
        return id;
    }

    public void setSalariu(float salariu) {
        salariu = salariu;
    }

    @Override
    public void preda() {
        StringBuilder builder=new StringBuilder();
        builder.append("Asistentul ").append(this.nume).append(" preda la seminar");
        System.out.println(builder.toString());
    }

    @Override
    public float calculareVenit() {
        return salariu;
    }
}
