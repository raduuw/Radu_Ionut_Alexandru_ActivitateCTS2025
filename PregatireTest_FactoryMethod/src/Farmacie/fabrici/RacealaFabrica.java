package Farmacie.fabrici;

import Farmacie.clase.Medicament;
import Farmacie.clase.Raceala;

public class RacealaFabrica implements FarmacieFabrica{

    @Override
    public Medicament createMedicament(float pret, String denumire) {
        return new Raceala(pret, denumire);
    }
}
