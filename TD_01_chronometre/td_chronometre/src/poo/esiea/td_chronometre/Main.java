package poo.esiea.td_chronometre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CTemps timer;
        Chrono chrono;
        String choice;
        System.out.println("Choisir le type de compteur (chrono ou min) : ");
        choice = sc.nextLine();
        if(choice.equalsIgnoreCase("chrono")){
            chrono = new Chrono();
            chrono.start();
            while(chrono.isRunning()){
                chrono.incrementSec();
                System.out.println("Temps écoulé: " + chrono.getHours() + " heures " + chrono.getMinutes() + " minutes " + chrono.getSeconds() + " secondes");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //arrêter le chronomètre
            chrono.stop();
            System.out.println("Temps final: " + chrono.getHours() + " heures " + chrono.getMinutes() + " minutes " + chrono.getSeconds() + " secondes");
        }else if (choice.equalsIgnoreCase("min")){
            int h, m, s;
            System.out.println("Entrer les heures : ");
            h = sc.nextInt();
            System.out.println("Entrer les minutes : ");
            m = sc.nextInt();
            System.out.println("Entrer les secondes : ");
            s = sc.nextInt();
            timer = new CTemps(Type.Minuteur,h, m, s);
            while(true){
                timer.decrementSec();
                if (timer.getHours() == 0 && timer.getMinutes() == 0 && timer.getSeconds() == 0){
                    break;
                }
                System.out.println("Temps restant: " + timer.getHours() + " heures " + timer.getMinutes() + " minutes " + timer.getSeconds() + " secondes");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Temps écoulé!");
        }
        sc.close();
    }
}


