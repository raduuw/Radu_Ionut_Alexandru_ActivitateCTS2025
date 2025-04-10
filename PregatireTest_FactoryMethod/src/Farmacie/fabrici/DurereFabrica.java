package Farmacie.fabrici;

import Farmacie.clase.Durere;
import Farmacie.clase.Medicament;

public class DurereFabrica implements FarmacieFabrica{

    @Override
    public Medicament createMedicament(float pret, String denumire) {
        return new Durere(pret, denumire);
    }
}
