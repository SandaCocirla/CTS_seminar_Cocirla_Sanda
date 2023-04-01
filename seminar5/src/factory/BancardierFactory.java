package factory;

import classes.Bancardier;
import classes.PersonalSpital;

public class BancardierFactory implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Bancardier(nume);
    }
}
