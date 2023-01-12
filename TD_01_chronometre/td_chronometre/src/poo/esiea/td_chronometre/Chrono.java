package poo.esiea.td_chronometre;


enum Type
{
	Chronomètre, Minuteur;
}

public class Chrono extends CTemps
{

	private boolean isRunning;
	

	public Chrono(){
		super(Type.Chronomètre, 0, 0, 0);
		this.isRunning = false;
	}
	
	public void start() {
		this.isRunning = true;
		while(this.isRunning()){
            super.incrementSec();
            System.out.println("Temps écoulé: " + super.getHours() + " heures " + super.getMinutes() + " minutes " + super.getSeconds() + " secondes");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	
	public void stop() {
		this.isRunning = false;	
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
}