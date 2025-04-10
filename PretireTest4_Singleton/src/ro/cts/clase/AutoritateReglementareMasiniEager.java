package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int reglementari;
    private static AutoritateReglementareMasiniEager instance=new AutoritateReglementareMasiniEager("Autoritate 1", "www.autoritate.ro", 3);

    private AutoritateReglementareMasiniEager(String nume, String website, int reglementari) {
        this.nume = nume;
        this.website = website;
        this.reglementari = reglementari;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setReglementari(int reglementari) {
        this.reglementari = reglementari;
    }

    public void reglementeazaMasini(String nume){
        this.reglementari=this.reglementari=1;
    }

    public static AutoritateReglementareMasiniEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", reglementari=").append(reglementari);
        sb.append('}');
        return sb.toString();
    }
}
