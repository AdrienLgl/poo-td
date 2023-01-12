package poo.esiea.td_employe ;

import java.util.ArrayList;

public class CPersonnel
{
	private ArrayList<CEmploye> m_employes;

    public CPersonnel() {
        m_employes = new ArrayList<CEmploye>();
    }

    public void embaucher(CEmploye employe) {
        m_employes.add(employe);
    }

    public void licencier(CEmploye employe) {
        m_employes.remove(employe);
    }

    public void faillite() {
        m_employes.clear();
    }

    public void printSalaires() {
        for (CEmploye employe : m_employes) {
            System.out.println(employe.getM_nom() + " " + employe.getM_prenom() + " : " + employe.calculSalaire() + "€");
        }
    }

    public float salaireMoyen() {
        float total = 0;
        for (CEmploye employe : m_employes) {
            total += employe.calculSalaire();
        }
        return total / m_employes.size();
    }
	
}

