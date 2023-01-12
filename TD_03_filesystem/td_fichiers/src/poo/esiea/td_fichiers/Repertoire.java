package poo.esiea.td_fichiers ;

import java.util.ArrayList;
import java.util.List;

class Repertoire extends Fichier {
    private List<Fichier> contenu;

	public Repertoire(String nom) {
        super(nom, "", 0);
        contenu = new ArrayList<Fichier>();
    }

    public void ajouterFichier(Fichier fichier) {
        contenu.add(fichier);
    }
    
    public void retirerFichier(Fichier fichier) {
        contenu.remove(fichier);
    }

    public void afficherContenu() {
        for (Fichier fichier : contenu) {
            System.out.println(fichier.getNom());
        }
    }

    public int getPoids() {
        int poids = 0;
        for (Fichier fichier : contenu) {
            poids += fichier.getTaille();
        }
        return poids;
    }
    
    public List<Fichier> getContenu() {
		return contenu;
	}

	public void setContenu(List<Fichier> contenu) {
		this.contenu = contenu;
	}
}

