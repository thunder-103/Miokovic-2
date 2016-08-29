package hr.vvg.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Casopis extends Publikacija {
	
	private int mjesecIzdavanjaCasopisa;
	
	private final static BigDecimal CIJENA_PO_PRIMJERKU = new BigDecimal("10.00");
			

	public Casopis(String naziv, int godinaIzdanja, int brojStranica, String vrstaPublikacije,
			int mjesecIzdavanjaCasopisa) {
		super(naziv, godinaIzdanja, brojStranica, vrstaPublikacije, 
				CIJENA_PO_PRIMJERKU.divide(new BigDecimal(brojStranica),2, RoundingMode.HALF_UP));
		this.mjesecIzdavanjaCasopisa = mjesecIzdavanjaCasopisa;
		
	}

	public int getMjesecIzdavanjaCasopisa() {
		return mjesecIzdavanjaCasopisa;
	}	
}
