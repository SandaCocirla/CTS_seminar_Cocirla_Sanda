package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReader = new AngajatReader();
			listaAngajati = aplicantReader.readAplicanti("angajati.txt");
			for(Aplicant aplicanti:listaAngajati)
				System.out.println(aplicanti.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
