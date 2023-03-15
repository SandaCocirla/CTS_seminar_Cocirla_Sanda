package singletonRegistry.main;

import singletonRegistry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstitutie("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutie("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstitutie("Politie");

        politie.setNumarAngajati(10);
        politieLocala.setNumarAngajati(15);
        pompieri.setNumarAngajati(11);


        System.out.println(politie);
        System.out.println(politieLocala);
        System.out.println(pompieri);

    }

}
