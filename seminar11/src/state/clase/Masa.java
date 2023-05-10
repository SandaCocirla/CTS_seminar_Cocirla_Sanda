package state.clase;

public class Masa implements IStare{
    private int numarMasa;
    private IStare stare;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.stare = new StareLibera();
    }

    protected void setStare(IStare s){
        this.stare = s;
    }


    @Override
    public void modificaStare(Masa masa) {

    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public IStare getStare() {
        return stare;
    }
    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }
    public void rezervaMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void anuleazaRezervare(){
        IStare stare1 =new StareLibera();
        stare1.modificaStare(this);
    }
}
