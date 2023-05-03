package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;
import composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("S1",100);
        UnitateBancara sucursala2 = new Sucursala("S2",70);

        UnitateBancara agentie = new Sucursala("A1",30);
        UnitateBancara agentie2 =new Sucursala("A2",50);

        UnitateBancara filiala1 = new Filiala("F1",50);
        UnitateBancara filiala2 = new Filiala("F2",60);
        UnitateBancara filiala3 = new Filiala("F3",40);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie.adaugaUnitate(filiala3);

        //sucursala1.printDescriere();
    }
}
