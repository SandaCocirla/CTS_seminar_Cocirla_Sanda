package strategy.main;

import strategy.classes.Operator;
import strategy.classes.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();
        operator.setModVerificare(new VerificarePersoanaJuridica());
        operator.verificaClient();
    }
}
