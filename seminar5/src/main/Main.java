package main;

import classes.PersonalSpital;
import factory.BancardierFactory;
import factory.MedicFactory;

public class Main {
    public static void main(String[] args) {
        MedicFactory factoryMedic = new MedicFactory();
        BancardierFactory bancardierFactory = new BancardierFactory();

        PersonalSpital medic1 = factoryMedic.createPersonal("Medic de familie");
        PersonalSpital medic2 = factoryMedic.createPersonal("Medic specialist");
        PersonalSpital bancardier = bancardierFactory.createPersonal("Bancardier");

    }
}
