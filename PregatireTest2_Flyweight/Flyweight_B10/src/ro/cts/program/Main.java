package ro.cts.program;


import ro.cts.clase.ClientAbstract;
import ro.cts.clase.FabricaClient;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClient fabrica=new FabricaClient();

        try{
            ClientAbstract client=fabrica.getClient(1, "Popescu", "07459595995", "popescu@gmail.com");
            Rezervare rezervare=new Rezervare(4, 6, 18);
            Rezervare rezervare1=new Rezervare(3, 6, 20);

            client.afiseazaClient(rezervare);
            client.afiseazaClient(rezervare1);

            Rezervare rezervare2=new Rezervare(4, 2, 20);
            Rezervare rezervare3=new Rezervare(5, 6, 3);

            fabrica.getClient(2, "Laur", "0742459343", "laur@gmail.com").afiseazaClient(rezervare2);
            fabrica.getClient(1).afiseazaClient(rezervare3);

        }catch (Exception ex){
            new RuntimeException();
        }

    }
}