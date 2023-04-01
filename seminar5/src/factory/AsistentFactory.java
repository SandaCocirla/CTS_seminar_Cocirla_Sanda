package factory;

import classes.Asistent;
import classes.PersonalSpital;

public class AsistentFactory implements Factory {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}
