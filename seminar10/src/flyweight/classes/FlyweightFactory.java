package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IClientBanca> mapCont;
    public FlyweightFactory(){
        this.mapCont =new HashMap<>();
    }

    public IClientBanca getDetinator(String nume, String nrTelefon, String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBanca client = (IClientBanca) new Detinator(nume, nrTelefon,adresa);
            mapCont.put(nume,client);

        }
        return mapCont.get(nume);
    }
}
