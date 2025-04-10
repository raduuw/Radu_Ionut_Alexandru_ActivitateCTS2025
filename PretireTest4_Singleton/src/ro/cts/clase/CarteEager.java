package ro.cts.clase;

public class CarteEager {
    private String titlu;
    private int nrPagini;
    private String autor;

    private static CarteEager instance=new CarteEager("Carte1", 50, "Autor1");

    private CarteEager(String titlu, int nrPagini, String autor) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.autor = autor;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static CarteEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarteEager{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", nrPagini=").append(nrPagini);
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
