package Farmacie.fabrici;

import Farmacie.clase.Corp;
import Farmacie.clase.Medicament;
import Farmacie.clase.Raceala;

public class CorpFabrica implements FarmacieFabrica{
    @Override
    public Medicament createMedicament(float pret, String denumire) {
        return new Corp(pret, denumire);
    }
}
