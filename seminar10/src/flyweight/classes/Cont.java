package flyweight.classes;

import java.util.StringJoiner;

public class Cont {
    private float suma;
    private int nrCont;

    public Cont(float suma, int nrCont) {
        this.suma = suma;
        this.nrCont = nrCont;
    }

    public float getSuma() {
        return suma;
    }

    public int getNrCont() {
        return nrCont;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cont.class.getSimpleName() + "[", "]")
                .add("suma=" + suma)
                .add("nrCont=" + nrCont)
                .toString();
    }
}
