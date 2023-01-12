package poo.esiea.td_fichiers;

public class Main {
    public static void main(String[] args) {
        Explorateur explorateur = new Explorateur();
        Console console = new Console(explorateur);
        console.start();
    }
}
