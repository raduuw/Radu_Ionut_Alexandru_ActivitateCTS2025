package ro.cts.clase;

public class VAN extends AMasina{
    public VAN(String model, String marca) {
        super(model, marca, TipMasina.VAN);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta masina este de tip VAN, marca "+getMarca());
    }
}
