package Farmacie.main;


import Farmacie.clase.Medicament;
import Farmacie.fabrici.CorpFabrica;
import Farmacie.fabrici.DurereFabrica;
import Farmacie.fabrici.FarmacieFabrica;
import Farmacie.fabrici.RacealaFabrica;

public class Main {
    public static void main(String[] args) {
        FarmacieFabrica fabrica=new CorpFabrica();
        Medicament medicament=fabrica.createMedicament(34, "paracetamol");
        medicament.descriere();

        FarmacieFabrica fabrica2=new DurereFabrica();
        Medicament medicament2=fabrica2.createMedicament(40, "parasinus");
        medicament2.descriere();

        FarmacieFabrica fabrica3=new RacealaFabrica();
        Medicament medicament3=fabrica3.createMedicament(20,"faringo");
        medicament3.descriere();

    }
}