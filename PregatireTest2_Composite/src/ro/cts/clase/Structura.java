package ro.cts.clase;

import java.sql.Struct;

public interface Structura {
    void adaugaStructura(Structura structura) throws Exception;
    void stergeStructura(Structura structura) throws Exception;
    void afiseazaDescriere();
    Structura getStructura(int cheie) throws Exception;
}
