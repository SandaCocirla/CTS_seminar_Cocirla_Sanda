package observer.main;

import observer.clase.Client;
import observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Popescu");
        Client client2 = new Client("Vasile");
        Client client3 = new Client("Radu");

        Restaurant restaurant = new Restaurant("Capitolis");

        restaurant.introduceOfertaNoua();
        restaurant.abonareClient(client1);
        restaurant.adaugaDiscount(15);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);

        restaurant.introduceOfertaNoua();

    }
}
