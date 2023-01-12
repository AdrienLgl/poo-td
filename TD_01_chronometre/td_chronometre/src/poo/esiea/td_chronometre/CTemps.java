package poo.esiea.td_chronometre;

public class CTemps
{

	private int hours;
	private int minutes;
	private int seconds;
	private Type type;
	

	public CTemps(Type type, int hours, int minutes, int seconds){
		super();
		this.type = type;
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
	}
	
	public CTemps incrementSec() {
		this.seconds++;
        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }
        return this;
	}
	
	public CTemps decrementSec() {
		this.seconds--;
        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes--;
        }
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours--;
        }
        return this;
	}
	
	public CTemps incrementMin(CTemps t) {
		this.seconds += t.getSeconds();
        this.minutes += t.getMinutes();
        this.hours += t.getHours();
        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }
        return this;
	}
	
	public CTemps decrementMin(CTemps t) {
		this.seconds -= t.getSeconds();
        this.minutes -= t.getMinutes();
        this.hours -= t.getHours();
        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes--;
        }
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours--;
        }
        return this;
	}
	
	public boolean compare(CTemps t) {
		return this.hours == t.getHours() && this.minutes == t.getMinutes() && this.seconds == t.getSeconds();	
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	
}
