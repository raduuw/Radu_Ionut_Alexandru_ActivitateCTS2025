package ro.cts.clase;

public abstract class InfoMijloc {
    private InfoMijloc urmMijloc;

    public InfoMijloc() {

    }

    public void setUrmMijloc(InfoMijloc urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public InfoMijloc getUrmMijloc() {
        return urmMijloc;
    }

    public abstract void recomandaMijloc(int distanta);
}
