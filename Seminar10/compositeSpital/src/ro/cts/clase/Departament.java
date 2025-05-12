package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> lista;
    private int nrAngajati;

    public Departament(int nrAngajati, String nume) {
        this.nrAngajati = nrAngajati;
        lista=new ArrayList<Structura>();
        this.nume = nume;
    }


    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul: " + nume + " are " + nrAngajati + " angajati"+ " si urmatoarele sectii: ");
        for(Structura structura: lista){
            structura.afiseazaDescriere();
        }

    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
