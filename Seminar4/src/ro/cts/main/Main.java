package ro.cts.main;

import ro.cts.clase.FabricaSupa.FabricaSupa;
import ro.cts.clase.FabricaSupa.TipSupa;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;

import static ro.cts.clase.FabricaSupa.TipSupa.*;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa=new FabricaSupa(15.99f, 60);
        Supa supaLegume=fabricaSupa.getSupa(LEGUME, 300);
        Supa supaVita= fabricaSupa.getSupa(VITA, 250);
        Supa supaCocos=fabricaSupa.getSupa(COCOS, 350);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}