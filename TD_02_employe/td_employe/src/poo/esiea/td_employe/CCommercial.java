package poo.esiea.td_employe ;

public class CCommercial extends CEmploye
{
	
	private static final float PART = 0;
	private float m_chiffreAffaire;
    private final float BASE = 1500;


	public CCommercial(String nom, String prenom, int age, int anciennete, float chiffreAffaire) {
		super(nom, prenom, age, anciennete);
		m_chiffreAffaire = chiffreAffaire;	
	}

	@Override
	public void print() {
	    super.print();
	    System.out.println("Chiffre d'affaire : " + m_chiffreAffaire);
	}

	@Override
	public float calculBaseSalaire() {
	    return BASE + (m_chiffreAffaire * PART);
	}
	
}

