package ro.cts.clase;

public class Item implements Meniu{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaSectiune(Meniu sectiune) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public void stergeSectiune(Meniu sectiune) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public Meniu getSeciune(int index) throws Exception{
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public void descriere() {
        System.out.println("Item " + nume);
    }
}
