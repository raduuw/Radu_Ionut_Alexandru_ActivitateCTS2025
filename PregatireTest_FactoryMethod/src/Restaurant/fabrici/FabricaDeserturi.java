package Restaurant.fabrici;

import Restaurant.clase.CheeseCake;
import Restaurant.clase.Clatite;
import Restaurant.clase.FelDeMancare;
import Restaurant.clase.Papanasi;

public class FabricaDeserturi implements FabricaRestaurant{
    @Override
    public FelDeMancare createFelDeMancare(TipFelMancare tip, float pret, float calorii, int cantitate) {
        switch ((Deserturi)tip){
            case PAPANASI -> {
                return new Papanasi(pret,calorii, cantitate);
            }
            case CLATITE -> {
                return new Clatite(pret, calorii, cantitate);
            }
            case CHEESECAKE -> {
                return new CheeseCake(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
