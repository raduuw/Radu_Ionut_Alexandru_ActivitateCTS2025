package ro.cts.clase;

import java.util.HashMap;

public class FabricaClient {
    private HashMap<Integer, ClientAbstract> listaClienti;

    public FabricaClient() {
        listaClienti = new HashMap<Integer, ClientAbstract>();
    }

    public ClientAbstract getClient(int codClient) throws Exception{
        ClientAbstract client=listaClienti.get(codClient);
        if(client==null){
            throw new Exception("Clientul nu exista");
        }
        else{
            return client;
        }
    }

    public ClientAbstract getClient(int codClient, String numeClient, String numarTelefon, String mail){
        ClientAbstract client=listaClienti.get(codClient);
        if(client==null){
            client=new Client(codClient, numeClient, numarTelefon, mail);
            listaClienti.put(codClient, client);
        }
        return client;
    }
}
