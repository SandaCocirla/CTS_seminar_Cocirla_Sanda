package classes;

public class Bancardier extends PersonalSpital{

    public Bancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Bancardierul "+super.getNume());
    }
}
