package ro.cts.main;


import ro.cts.clase.AgentieFactory;
import ro.cts.clase.PachetTuristic;
import ro.cts.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory agentie=new AgentieFactory();
        try{
            PachetTuristic pachetCazare=agentie.createPachet(TipPachet.CAZARE);
            PachetTuristic pachetTransport=agentie.createPachet(TipPachet.TRANSPORT);
            PachetTuristic pachetCazareTransport=agentie.createPachet(TipPachet.CAZARE_TRANSPORT);

            pachetTransport.descriere();
            pachetCazare.descriere();
            pachetCazareTransport.descriere();
        }catch (Exception e){
            System.out.println("Tipul nu este corect");
        }
    }
}