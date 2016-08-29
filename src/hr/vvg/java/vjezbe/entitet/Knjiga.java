package hr.vvg.java.vjezbe.entitet;

import java.math.BigDecimal;

public class Knjiga extends Publikacija implements ZaPosudbu {
	
	private Boolean dostupnaZaPosudbu;
	private String jezikKnjige;
	private Izdavac izdavacKnjige;
	
	private static final BigDecimal CIJENA_PO_STRANICI_HR = new BigDecimal("0.50");
	private static final BigDecimal CIJENA_PO_STRANICI_FOREIGN = new BigDecimal("0.70");

	public Knjiga(String naziv, String jezikKnjige, Izdavac izdavacKnjige, int godinaIzdanja,
			String vrstaPublikacije, BigDecimal cijenaPoStranici, int brojStranica, 
			Boolean dostupnaZaPosudbu) {
		
		super(naziv, godinaIzdanja, brojStranica, vrstaPublikacije, cijenaPoStranici);
		this.jezikKnjige = jezikKnjige;
		this.izdavacKnjige = izdavacKnjige;
		this.dostupnaZaPosudbu = true;
	}
	
	public void posudba() {
		
		this.dostupnaZaPosudbu = false;
	}
	
	public void vracanje() {
		
		this.dostupnaZaPosudbu = true;
	}
	
	public Boolean provjeriRaspolozivost() {
		
		return this.dostupnaZaPosudbu;
	}

	public String getJezikKnjige() {
		return jezikKnjige;
	}

	public Izdavac getIzdavacKnjige() {
		return izdavacKnjige;
	}

	public static BigDecimal getCijenaPoStraniciHr() {
		return CIJENA_PO_STRANICI_HR;
	}

	public static BigDecimal getCijenaPoStraniciForeign() {
		return CIJENA_PO_STRANICI_FOREIGN;
	}
	
}
