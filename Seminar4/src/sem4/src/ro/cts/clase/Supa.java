package sem4.src.ro.cts.clase;

public abstract class Supa {
    private float pret;
    private float cantitate;
    private float calorii;

    public Supa(float pret, float cantitate, float calorii) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    public float getCalorii() {
        return calorii;
    }

    public void setCalorii(float calorii) {
        this.calorii = calorii;
    }

    public float calculeazaPretPerSutaDeGrame(){
        return pret/calorii*100;
    }

    public abstract void afiseazaDescriere();
}
