package singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;

    private int numarAngajati;

    private static Map<String, InstitutiePublica> registruInstitutii= new HashMap<>();//eager initialization

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(registruInstitutii.containsKey(denumire)){
            return registruInstitutii.get(denumire);
        } else{
          InstitutiePublica institutiePublica = new InstitutiePublica(denumire,0);
          registruInstitutii.put(denumire,institutiePublica);
          return institutiePublica;
        }
    }

    /*public synchronized static InstitutiePublicaOptimizata getInstitutie(String denumire){
        if(!registruInstitutii.containsKey(denumire)){
            registruInstitutii.put(denumire,new InstitutiePublica(denumire,0) );
        }
            return registruInstitutii.get(denumire);

    }*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}

