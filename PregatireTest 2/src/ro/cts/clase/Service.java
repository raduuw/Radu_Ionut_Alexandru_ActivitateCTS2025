package ro.cts.clase;

public class Service implements IService{

    private static Service instance;
    private AMasina masinaInService;

    private Service() {
    }

    public static Service getInstance(){
        if(instance==null){
            instance=new Service();
        }
        return instance;
    }

    @Override
    public void adaugaMasinaInService(AMasina masina) {
        if(masinaInService==null){
            masinaInService=masina;
            System.out.println("Masina de tip " + masina.getTip() + " a fost acceptata in service");
            masina.descriere();

        }else{
            System.out.println("Serviceul e ocupat!");
        }
    }

    @Override
    public void elibereazaService() {
        if(masinaInService!=null){
            System.out.println("Masina "+ masinaInService.getTip() + " a fost eliberata");
            masinaInService=null;
        }else{
            System.out.println("Service-ul este deja liber");
        }
    }
}
