package poo.esiea.td_employe ;

public class CEmploye
{
	
	private String m_nom;
	private String m_prenom;
	private int m_age;
	private int m_anciennete;
    protected float m_salaire;

	public CEmploye(String nom, String prenom, int age, int anciennete) {
		super();
		m_nom = nom;
        m_prenom = prenom;
        m_age = age;
        m_anciennete = anciennete;	
	}
	
	public void print() {
		System.out.println("Nom : " + m_nom);
        System.out.println("Prénom : " + m_prenom);
        System.out.println("Age : " + m_age);
        System.out.println("Ancienneté : " + m_anciennete + " ans");
	}
	
	public float calculBaseSalaire() {
		// cette méthode doit être surchargée dans les classes dérivées
        return 0;
	}
	
	public String getM_nom() {
		return m_nom;
	}

	public void setM_nom(String m_nom) {
		this.m_nom = m_nom;
	}

	public String getM_prenom() {
		return m_prenom;
	}

	public void setM_prenom(String m_prenom) {
		this.m_prenom = m_prenom;
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public int getM_anciennete() {
		return m_anciennete;
	}

	public void setM_anciennete(int m_anciennete) {
		this.m_anciennete = m_anciennete;
	}

	public float getM_salaire() {
		return m_salaire;
	}

	public void setM_salaire(float m_salaire) {
		this.m_salaire = m_salaire;
	}

	public float calculSalaire() {
        this.m_salaire = calculBaseSalaire() + (calculBaseSalaire() * (m_anciennete * 0.05f));
        return m_salaire;	
	}
	
}

