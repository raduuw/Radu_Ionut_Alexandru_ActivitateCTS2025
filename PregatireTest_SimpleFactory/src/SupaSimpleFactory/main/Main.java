package SupaSimpleFactory.main;


import SupaSimpleFactory.clase.Supa;
import SupaSimpleFactory.clase.SupaFactory;
import SupaSimpleFactory.clase.TipSupa;
import ro.cts.clase.AgentieFactory;
import ro.cts.clase.PachetTuristic;
import ro.cts.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        SupaFactory fabrica=new SupaFactory(15, 300);
        Supa supaLegume= fabrica.getSupa(TipSupa.LEGUME, 400);
        Supa supaVita=fabrica.getSupa(TipSupa.VITA, 340);
        Supa supaCiuperci=fabrica.getSupa(TipSupa.CIUPERCI, 350);

        supaCiuperci.descriere();
        supaLegume.descriere();
        supaVita.descriere();
    }
}