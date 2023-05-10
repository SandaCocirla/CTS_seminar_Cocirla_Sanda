package template.clase;

public class MasaRezervata extends IMasa{
    private String oraRezervare;

    public MasaRezervata(int nr, String oraRezervare) {
        super(nr);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa "+ super.getNr() + " a fost curatata inainte de ora "+oraRezervare );
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa "+ super.getNr() + " a fost aranjata cu servetele inainte de ora "+oraRezervare );
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa "+ super.getNr() + " a fost aranjata cu tacamuri inainte de ora "+oraRezervare );
    }

    @Override
    protected void invitaPersoane() {
        System.out.println(" Va invitam la masa "+ super.getNr() + " la ora "+oraRezervare );
    }
}
