package template.clase;

public class Masa extends IMasa{
    public Masa(int nr) {
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa s-a curatat"+super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("S-au aranjat servetelele"+super.getNr());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("S-au asezat tacamurile"+super.getNr());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Persoanele au fost invitate"+super.getNr());
    }
}
