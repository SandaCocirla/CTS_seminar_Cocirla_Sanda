package flyweight.classes;

import java.util.StringJoiner;

public class Detinator {
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Detinator.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("nrTelefon='" + nrTelefon + "'")
                .add("adresa='" + adresa + "'")
                .toString();
    }
    public void descriere(Cont cont){
        System.out.println(this.toString()+cont.toString());
    }
}
