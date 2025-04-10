package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {
    private String nume;
    private String website;
    private int reglementari;

    private static AutoritateReglementareMasiniLazy instance=null;

    private AutoritateReglementareMasiniLazy(String nume, String website, int reglementari) {
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
        this.reglementari=this.reglementari+1;
    }

    public static AutoritateReglementareMasiniLazy getInstance(String nume, String website){
        if(instance==null){
            instance=new AutoritateReglementareMasiniLazy(nume, website, 0);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", reglementari=").append(reglementari);
        sb.append('}');
        return sb.toString();
    }
}
