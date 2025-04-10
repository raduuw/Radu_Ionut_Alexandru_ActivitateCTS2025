package ro.cts.clase;

public class SUV extends AMasina{
    public SUV(String model, String marca) {
        super(model, marca, TipMasina.SUV);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta masina este de tip SUV, marca "+getMarca());
    }
}
