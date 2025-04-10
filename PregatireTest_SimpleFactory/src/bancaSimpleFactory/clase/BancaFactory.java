package bancaSimpleFactory.clase;

public class BancaFactory {

    private String detinator;
    private float suma;

    public BancaFactory(String detinator, float suma) {
        this.detinator = detinator;
        this.suma = suma;
    }

    public Credit createCredit(TipCredit tipCredit){
        switch (tipCredit){
            case IPOTECAR -> {
                return new CreditIpotecar(detinator, suma);
            }
            case NEVOI_PERSONALE -> {
                return new CreditNevoiPersonale(detinator, suma);
            }
            default -> {
                return null;
            }
        }
    }
}
