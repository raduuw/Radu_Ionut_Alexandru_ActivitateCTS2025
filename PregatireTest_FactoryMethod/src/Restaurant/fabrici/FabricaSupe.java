package Restaurant.fabrici;

import Restaurant.clase.FelDeMancare;
import Restaurant.clase.SupaCiuperci;
import Restaurant.clase.SupaLegume;
import Restaurant.clase.SupaVita;

public class FabricaSupe implements FabricaRestaurant{
    @Override
    public FelDeMancare createFelDeMancare(TipFelMancare tip, float pret, float calorii, int cantitate) {
        switch ((Supe)tip){
            case SUPA_VITA -> {
                return new SupaVita(pret, calorii, cantitate);
            }
            case SUPA_LEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
