package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {

   private int id;
   private float salariu;
   private float sporVechime;

    public Profesor(String nume, int varsta, int id, float salariu, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public int getId() {
        return id;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public float calculareVenit() {
        return salariu * (salariu * sporVechime);
    }

    @Override
    public void preda() {
        StringBuilder builder=new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append(" preda la curs");
        System.out.println(builder.toString());
    }
}
