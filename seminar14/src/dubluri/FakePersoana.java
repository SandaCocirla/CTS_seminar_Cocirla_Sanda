package dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana {

    private int getVarstaValue;
    private boolean checkCNPValue;


    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }

    public FakePersoana setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
        return this;
    }

    public FakePersoana setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
        return this;
    }
}
