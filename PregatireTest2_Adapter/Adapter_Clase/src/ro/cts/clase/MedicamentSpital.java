package ro.cts.clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Medicamentul "+ this.numeMedicament+ " este achizitionat la pretul de "+this.pret);
    }

    public void prezintaReteta(){
        System.out.println("este prezentata reteta pt medicamentil "+ this.numeMedicament);
    }
}
