package dubluri;

import clase.IPersoana;

public class StubPersoanaMinora implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 16;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
