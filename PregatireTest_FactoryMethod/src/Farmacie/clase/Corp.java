package Farmacie.clase;

public class Corp extends Medicament{

    public Corp(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println("Corp " + toString());
    }
}
