package main;

import clase.ContBancar;
import clase.ContBancarBuilder;
import clase.ContBuilder;
import clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        ContBuilder contBuilder=new ContBuilder();
        contBuilder.setNumeClient("ANdreea").setCardAtasat(true);
        ContBancar contBancar = contBuilder.build();
        System.out.println(contBancar);
        ContBancar contBancar1 = contBuilder.setNumeClient("Daniel").setPrimesteSalariu(true).build();

        IBuilder contBancarBuilder = new ContBancarBuilder();
        /*ContBancar cont = contBancarBuilder.setInternetBanking(true).setNumeClient("Andrei");
        ContBancar cont1 = contBancarBuilder.setInternetBanking(true).setNumeClient("Amalia");*/

      /*  System.out.println(cont);
        System.out.println(cont1);*/

    }
}
