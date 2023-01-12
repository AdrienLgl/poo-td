package poo.esiea.td_fichiers;

import java.util.Scanner;

class Console {
    private Explorateur explorateur;
    private boolean modeConsole;

    public Console(Explorateur explorateur) {
        this.explorateur = explorateur;
    }

    public void start() {
        modeConsole = true;
        Scanner scanner = new Scanner(System.in);
        while (modeConsole) {
            System.out.print(explorateur.getRepertoireCourant().getNom() + "> ");
            String commande = scanner.nextLine();
            executerCommande(commande);
        }
    }

    private void executerCommande(String commande) {
        String[] commandeSplit = commande.split(" ");
        switch (commandeSplit[0]) {
            case "cd":
                changerRepertoire(commandeSplit[1]);
                break;
            case "ls":
                explorateur.afficherContenu();
                break;
            case "mkdir":
                explorateur.creerDossier(commandeSplit[1]);
                break;
            case "touch":
                explorateur.creerFichier(commandeSplit[1], commandeSplit[2], Integer.parseInt(commandeSplit[3]));
                break;
            case "rm":
                supprimer(commandeSplit[1]);
                break;
            case "pwd":
                explorateur.afficherChemin();
                break;
            case "quit":
                modeConsole = false;
                break;
            default:
                System.out.println("Commande non reconnue");
                break;
        }
    }

    private void changerRepertoire(String nom) {
        for (Fichier fichier : explorateur.getRepertoireCourant().getContenu()) {
            if (fichier.getNom().equals(nom) && fichier instanceof Repertoire) {
                explorateur.changerRepertoire((Repertoire) fichier);
                return;
            }
        }
        System.out.println("Le répertoire n'existe pas");
    }
    private void supprimer(String nom) {
    	for (Fichier fichier : explorateur.getRepertoireCourant().getContenu()) {
    		if (fichier.getNom().equals(nom)) {
    			if (fichier instanceof Repertoire) {
    				explorateur.supprimerDossier((Repertoire) fichier);
			    } else {
			    	explorateur.supprimerFichier((Fichier) fichier);
			    }
    			return;
    		}
    	}
    	System.out.println("Le fichier ou répertoire n'existe pas");
    }
}
