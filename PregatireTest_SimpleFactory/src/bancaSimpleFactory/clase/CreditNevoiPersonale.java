package bancaSimpleFactory.clase;

public class CreditNevoiPersonale extends Credit{
    public CreditNevoiPersonale(String detinator, float suma) {
        super(detinator, suma);
    }

    @Override
    public void descriere() {
        System.out.println("Credit nevoi personale " + super.toString());
    }
}
