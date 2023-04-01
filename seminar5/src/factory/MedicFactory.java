package factory;

import classes.Medic;
import classes.PersonalSpital;

public class MedicFactory implements Factory{

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
