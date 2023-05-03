package composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara);
    void sergeUnitate(UnitateBancara unitateBancara);
    UnitateBancara getUnitate(int index);

    void printDescriere(String indentare);


}
