package ro.cts.clase;

public class Pacient implements PacientAbstract{
    private String numePacient;
    private String nrTelefon;
    private String adresaMail;

    public Pacient(String numePacient, String nrTelefon, String adresaMail) {
        this.numePacient = numePacient;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                '}';
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare.toString());
    }
}
