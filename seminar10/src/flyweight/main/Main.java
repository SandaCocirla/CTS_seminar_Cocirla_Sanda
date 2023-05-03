package flyweight.main;

import flyweight.classes.Cont;
import flyweight.classes.FlyweightFactory;
import flyweight.classes.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();

        Cont cont1 = new Cont(2300f,12);
        Cont cont2 = new Cont(4000f,13);
        Cont cont3 = new Cont(4200f,14);

//        IClientBanca detinator = fabrica.getDetinator("Ion","2568946","Strada Movilitei");
//        detinator.descriere
//        fabrica.getDetinator("Alin","458964","Strada la strada").descriere(cont2);
//        fabrica.getDetinator("Ion","2568946","Strada Movilitei").descriere(cont3);
//        fabrica.getDetinator("Alin","458964","Strada la strada").descrire(cont1);
    }
}
