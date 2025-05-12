package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacient {
    private HashMap<String, PacientAbstract> colectiePacienti;

    public FabricaPacient() {
        this.colectiePacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String nrTelefon) throws Exception{
        PacientAbstract pacient=colectiePacienti.get(nrTelefon);
        if(pacient==null){
            throw new Exception("Pacientul nu exista");
        }
        return pacient;
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresaMail){
        PacientAbstract pacient=colectiePacienti.get(nrTelefon);
        if(pacient==null){
            pacient=new Pacient(nume, nrTelefon, adresaMail);
            colectiePacienti.put(nrTelefon, pacient);
        }
        return pacient;
    }
}
