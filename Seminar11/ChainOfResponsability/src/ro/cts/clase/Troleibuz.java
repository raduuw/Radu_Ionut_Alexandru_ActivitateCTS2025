package ro.cts.clase;

public class Troleibuz extends InfoMijloc{




    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta<3){
            System.out.println("Calatorul o sa ia troleibuzul");
        }else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
