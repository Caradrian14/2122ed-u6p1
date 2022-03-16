package ed.adria;

public class Institut {

	private static final int ANY = 2022;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOM_ALUMNE = "Jorda";
	private static final String NOM_ALMUNE = "Adria";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALMUNE;
		p.cognom = COGNOM_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
