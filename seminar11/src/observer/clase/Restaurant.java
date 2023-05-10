package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{

    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void notificareClient(String mesaj) {
        for(IClient client :this.listaClienti){
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua(){
        String mesaj = new String(this.nume + " a intodus o oferta noua.");
        notificareClient(mesaj);
    }

    public void adaugaDiscount(int discount){
        String mesaj = new String(this.nume + " a introdus un discount de "+discount+ " %");
        notificareClient(mesaj);
    }
}
