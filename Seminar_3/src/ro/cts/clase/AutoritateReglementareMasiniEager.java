package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance=new AutoritateReglementareMasiniEager("AutoritateAuto1", "www.autoritate.ro", 3);

    private AutoritateReglementareMasiniEager(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

     public void regelementariModel(String nume){
        nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
