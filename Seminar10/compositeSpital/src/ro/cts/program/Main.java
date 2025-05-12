package ro.cts.program;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura departament1=new Departament(34, "pediatrie");
        Structura departament2=new Departament(22, "ICU");
        Structura departament3=new Departament(40, "general");

        Sectie sectie1=new Sectie("sectie1");
        Sectie sectie2=new Sectie("sectie2");
        Sectie sectie3=new Sectie("sectie3");

        try{

            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);

            departament3.adaugaStructura(sectie3);
            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);

            departament3.afiseazaDescriere();
        } catch (Exception e){
            System.out.printf(e.toString());
        }
        }
    }
