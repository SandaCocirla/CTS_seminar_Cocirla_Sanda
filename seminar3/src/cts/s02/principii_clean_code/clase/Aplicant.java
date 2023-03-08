package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;

	private static int sumaFinantata;
	static int pragPunctaj =80;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus(){
		if(this.punctaj>Aplicant.pragPunctaj)
			System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
		else
			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
		}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return numarProiecte;
	}
	public void setNr_proiecte(int numarProiecte,String[] denumiriProiecte) {

		this.numarProiecte = numarProiecte;
		this.denumireProiect = new String[this.numarProiecte];
		for (int i =0;i<this.numarProiecte;i++){
			denumireProiect[i]= denumiriProiecte[i] ;
		}
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(numarProiecte);
		sb.append(", denumireProiect=").append(denumireProiect == null ? "null" : Arrays.asList(denumireProiect).toString());

		return sb.toString();
	}
	public abstract void afisareFinantare();
	protected void afisareFinantare(String tipAplicant, int sumaFinantata) {
		System.out.println(tipAplicant + this.getNume()+" "+this.getPrenume()+" primeste"+ sumaFinantata+" Euro/zi in proiect.");
	}

	public void setProiecte(int numarProiecte, String[] denumiriProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumireProiect = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++) {
			this.denumireProiect[i] = denumiriProiecte[i];
		}
	}
}
