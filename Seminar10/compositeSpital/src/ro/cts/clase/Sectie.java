package ro.cts.clase;

public class Sectie implements Structura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }


    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw new Exception("nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectie " + nume);
    }

    @Override
    public Structura getStructura(int index) {
        return null;
    }
}
