package bancaSimpleFactory.main;


import bancaSimpleFactory.clase.BancaFactory;
import bancaSimpleFactory.clase.Credit;
import bancaSimpleFactory.clase.TipCredit;
import ro.cts.clase.AgentieFactory;
import ro.cts.clase.PachetTuristic;
import ro.cts.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        BancaFactory banca=new BancaFactory("Maricica", 1400);
        Credit crediNevoiPersonale= banca.createCredit(TipCredit.NEVOI_PERSONALE);
        Credit creditIpotecar= banca.createCredit(TipCredit.IPOTECAR);

        crediNevoiPersonale.descriere();
        creditIpotecar.descriere();
    }
}