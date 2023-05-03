package strategy.classes;

public class Operator {
    private ModVerificare modVerificare;

    public Operator(){
        this.modVerificare = new VerificarePersoanaFizica();
    }
    public void setModVerificare(ModVerificare mod){
        this.modVerificare=mod;

    }
    public void verificaClient(){
        modVerificare.verifica();
    }
}
