package poo.esiea.td_fichiers ;


class Fichier {
    private String nom;
    private String extension;
    private int taille;

    public Fichier(String nom, String extension, int taille) {
        this.nom = nom;
        this.extension = extension;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public String getExtension() {
        return extension;
    }

    public int getTaille() {
        return taille;
    }
    
    @Override
    public Fichier clone() {
        try {
            // appel de la méthode clone() de la classe mère pour créer une copie superficielle
            Fichier fichierCopie = (Fichier) super.clone();
            // ici on peut crée une copie profonde des attributs
            fichierCopie.nom = new String(this.nom);
            fichierCopie.extension = new String(this.extension);
            return fichierCopie;
        } catch (CloneNotSupportedException e) {
            // ne devrait jamais arriver car nous implementons Cloneable
            throw new InternalError(e);
        }
    }
}

