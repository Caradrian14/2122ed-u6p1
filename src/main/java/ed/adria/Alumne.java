package ed.adria;

public class Alumne {
	
	
	public String nom;
	public String cognom;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "nom = " + nom + System.lineSeparator() +
				"cognom = " + cognom + System.lineSeparator() +
				"any = " + any + System.lineSeparator() +
				"cicleFormatiu = " + cicleFormatiu;
				
		
	}

}
