package poo.esiea.td_employe ;

public class CTechnicien extends CEmploye
{
	private final float BASE = 1000;
    private final float PART = 0.05f;
    private final float GAIN_UNITE = 10;
    private int m_nbUniteProduite;

    public CTechnicien(String nom, String prenom, int age, int anciennete, int nbUniteProduite) {
        super(nom, prenom, age, anciennete);
        m_nbUniteProduite = nbUniteProduite;
    }

    @Override
    public float calculBaseSalaire() {
        return BASE + (m_nbUniteProduite * PART * GAIN_UNITE);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Nombre d'unités produites : " + m_nbUniteProduite);
    }
	
}

