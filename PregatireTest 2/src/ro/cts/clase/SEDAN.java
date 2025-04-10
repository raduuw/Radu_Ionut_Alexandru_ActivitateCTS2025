package ro.cts.clase;

public class SEDAN extends AMasina{

    public SEDAN(String model, String marca) {
        super(model, marca, TipMasina.SEDAN);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o masina de tip SEDAN, marca " + getMarca());

    }
}
