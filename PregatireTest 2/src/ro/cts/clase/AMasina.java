package ro.cts.clase;

public abstract class AMasina {
    private String model;
    private String marca;
    private TipMasina tip;

    public AMasina(String model, String marca, TipMasina tip) {
        this.model = model;
        this.marca = marca;
        this.tip = tip;
    }

    public TipMasina getTip(){
        return tip;
    }

    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void descriere();
}
