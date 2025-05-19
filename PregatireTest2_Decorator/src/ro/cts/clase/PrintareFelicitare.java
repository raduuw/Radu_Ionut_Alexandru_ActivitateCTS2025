package ro.cts.clase;

public abstract class PrintareFelicitare implements Nota{
    private Nota notaDePlata;

    public PrintareFelicitare(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    public abstract void printareFelicitare();
}
