package ro.cts.program;


import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa=new FactorySupa(500);
        FactoryDesert factoryDesert=new FactoryDesert("vanilie");
        FelDeMancare supaDeLegume=factorySupa.creareFelDeMancare(Supe.supaDeLegume, 20.5f, 4500);
        factorySupa.setCantitate(499);
        FelDeMancare supaDeCiuperci=factorySupa.creareFelDeMancare(Supe.supaDeCiuperci, 22.5f, 3000);
        FelDeMancare tiramisu=factoryDesert.creareFelDeMancare(Deserturi.Tiramisu, 25.5f, 2312);
        FelDeMancare papanasi=factoryDesert.creareFelDeMancare(Deserturi.Papanasi, 20.5f, 3231);
        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperci);
        System.out.println(tiramisu);
        System.out.println(papanasi);

    }
}