package poo.esiea.td_fichiers ;

import java.io.FileWriter;
import java.io.IOException;

class Explorateur {
    private Repertoire repertoireRacine;
    private Repertoire repertoireCourant;

    public Explorateur() {
        repertoireRacine = new Repertoire("root");
        repertoireCourant = repertoireRacine;
    }

    public void changerRepertoire(Repertoire repertoire) {
        repertoireCourant = repertoire;
    }

    public void afficherContenu() {
        repertoireCourant.afficherContenu();
    }
    
    public void afficherChemin() {
        System.out.println(repertoireCourant.getNom());
    }

    public void creerDossier(String nom) {
        Repertoire nouveauDossier = new Repertoire(nom);
        repertoireCourant.ajouterFichier(nouveauDossier);
    }

    public void supprimerDossier(Repertoire dossier) {
        repertoireCourant.getContenu().remove(dossier);
    }

    public void creerFichier(String nom, String extension, int taille) {
        Fichier nouveauFichier = new Fichier(nom, extension, taille);
        repertoireCourant.ajouterFichier(nouveauFichier);
    }

    public void supprimerFichier(Fichier fichier) {
        repertoireCourant.getContenu().remove(fichier);
    }

	public Repertoire getRepertoireRacine() {
		return repertoireRacine;
	}

	public void setRepertoireRacine(Repertoire repertoireRacine) {
		this.repertoireRacine = repertoireRacine;
	}

	public Repertoire getRepertoireCourant() {
		return repertoireCourant;
	}

	public void setRepertoireCourant(Repertoire repertoireCourant) {
		this.repertoireCourant = repertoireCourant;
	}
	
	public void sauvegarder(String nomFichier) {
	    try (FileWriter writer = new FileWriter(nomFichier)) {
	        this.sauvegarderRecursivement(repertoireRacine, writer);
	    } catch (IOException e) {
	        System.err.println("Erreur lors de la sauvegarde : " + e.getMessage());
	    }
	}

	private void sauvegarderRecursivement(Repertoire repertoire, FileWriter writer) throws IOException {
	    for (Fichier fichier : repertoire.getContenu()) {
	        writer.write(fichier.getNom() + " " + fichier.getExtension() + " " + fichier.getTaille() + "\n");
	        if (fichier instanceof Repertoire) {
	            sauvegarderRecursivement((Repertoire) fichier, writer);
	        }
	    }
	}
	
	public void deplacerFichier(Fichier fichier, Repertoire destination) {
        if (repertoireCourant.getContenu().contains(fichier)) {
            repertoireCourant.retirerFichier(fichier);
            destination.ajouterFichier(fichier);
        } else {
            System.out.println("Le fichier spécifié n'existe pas dans le répertoire courant.");
        }
    }

    public void copierFichier(Fichier fichier, Repertoire destination) {
        if (repertoireCourant.getContenu().contains(fichier)) {
            Fichier fichierCopie = (Fichier) fichier.clone();
            destination.ajouterFichier(fichierCopie);
        } else {
            System.out.println("Le fichier spécifié n'existe pas dans le répertoire courant.");
        }
    }
    
}
