package Restaurant.main;


import Farmacie.clase.Medicament;
import Farmacie.fabrici.CorpFabrica;
import Farmacie.fabrici.DurereFabrica;
import Farmacie.fabrici.FarmacieFabrica;
import Farmacie.fabrici.RacealaFabrica;
import Restaurant.clase.FelDeMancare;
import Restaurant.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaRestaurant fabrica=new FabricaSupe();
        FabricaRestaurant fabricaDeserturi=new FabricaDeserturi();

        FelDeMancare fel=fabrica.createFelDeMancare(Supe.SUPA_LEGUME, 12, 400, 350);
        fel.descriere();
        fel=fabricaDeserturi.createFelDeMancare(Deserturi.CHEESECAKE, 30, 323, 434);
        fel.descriere();
    }
}