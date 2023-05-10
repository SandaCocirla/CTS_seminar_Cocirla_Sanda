package template.clase;

public abstract class IMasa {
    public IMasa(int nr) {
        this.nr = nr;
    }

    private int nr;

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();
    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        ocupaMasa();
    }

    public int getNr() {
        return nr;
    }
}
