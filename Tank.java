package lesson4.tankInheritance;

public class Tank {

	private String color;
	private int crew;
	private int maxSpeed;
	
	public Tank() {
		
	}
	
	public Tank(String color, int crew, int maxSpeed) {
		
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		
		if (crew < 0) {
			this.crew = 0;
		}
		else {
			this.crew = crew;
		}
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		
		if (maxSpeed > 150) {
			this.maxSpeed = 150;
		}
		else {
			this.maxSpeed = maxSpeed;
		}
	}
}
