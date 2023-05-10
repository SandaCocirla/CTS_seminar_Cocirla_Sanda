package template.main;

import state.clase.Masa;
import template.clase.IMasa;
import template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.ocupareMasa();

        IMasa masaRezervata = new MasaRezervata(2,"14:30");
        masaRezervata.ocupaMasa();
    }
}
