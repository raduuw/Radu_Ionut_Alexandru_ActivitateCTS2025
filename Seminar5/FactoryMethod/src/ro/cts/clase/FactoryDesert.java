package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{

    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, int calorii) {
        switch (tipFelDeMancare){
            case Deserturi.Papanasi -> {
                return new Papanasi(pret, calorii, crema);
            }
            case Deserturi.Tiramisu ->{
                return new Tiramisu(pret, calorii, crema);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
