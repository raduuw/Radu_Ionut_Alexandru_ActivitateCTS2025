package ro.cts.clase;

public interface Meniu {
    void adaugaSectiune(Meniu sectiune) throws Exception;
    void stergeSectiune(Meniu sectiune) throws Exception;
    Meniu getSeciune(int index) throws Exception;
    void descriere();
}
