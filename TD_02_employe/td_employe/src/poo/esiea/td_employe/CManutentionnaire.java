package poo.esiea.td_employe ;


public class CManutentionnaire  extends CEmploye
{
	private final float BASE_HORAIRE = 20;
	private int m_nbHeures;
	
	public CManutentionnaire(String nom, String prenom, int age, int anciennete, int nbHeures) {
	    super(nom, prenom, age, anciennete);
	    m_nbHeures = nbHeures;
	}
	
	@Override
	public float calculBaseSalaire() {
	    return BASE_HORAIRE * m_nbHeures;
	}
	
	@Override
	public void print() {
	    super.print();
	    System.out.println("Nombre d'heures : " + m_nbHeures);
	}
}

