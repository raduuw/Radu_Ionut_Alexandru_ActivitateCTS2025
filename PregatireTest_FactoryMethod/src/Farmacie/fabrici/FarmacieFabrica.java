package Farmacie.fabrici;

import Farmacie.clase.Medicament;

public interface FarmacieFabrica {
    public Medicament createMedicament(float pret, String denumire);
}
