package main;

import singleton.classes.BazaDate;
import singleton.classes.Secretariat;

public class Main {
    public static void main(String[] args){
        Secretariat secretariat = Secretariat.getInstanta(2043,11);
        Secretariat secretariat2 = Secretariat.getInstanta(2044,10);

        System.out.println(secretariat);
        System.out.println(secretariat2);

        BazaDate bazaDate = BazaDate.getInstance();
        BazaDate bazaDate1 = BazaDate.getInstance();
        bazaDate.setDimensiuneDate(200);
        bazaDate1.setDimensiuneDate(300);//ambele vor avea valoarea asta

        System.out.println(bazaDate);
        System.out.println(bazaDate1);

    }

}
