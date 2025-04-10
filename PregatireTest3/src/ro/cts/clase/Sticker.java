package ro.cts.clase;

public class Sticker {
    private String model;
    private int anFabricatie;
    private int latime;
    private int inaltime;

    public Sticker(String model, int anFabricatie, int latime, int inaltime) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void afiseazaSticker() {
        System.out.println("Model: " + model + ", An Fabricatie: " + anFabricatie
                + ", Latime: " + latime + ", Inaltime: " + inaltime);
    }
}
