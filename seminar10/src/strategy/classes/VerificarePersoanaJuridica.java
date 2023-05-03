package strategy.classes;

public class VerificarePersoanaJuridica implements ModVerificare{
    @Override
    public void verifica() {
        System.out.println("Verifica pj la registrul comertului");
    }
}
