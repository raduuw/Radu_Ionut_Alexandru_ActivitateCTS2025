package Restaurant.fabrici;

import Restaurant.clase.FelDeMancare;

public interface FabricaRestaurant {
    public FelDeMancare createFelDeMancare(TipFelMancare tip, float pret, float calorii, int cantitate);
}
