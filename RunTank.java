package lesson4.tankInheritance;

public class RunTank {

	public static void main(String[] args) {
		
		RunTank runTank = new RunTank();
		Tank tank = new Tank();
		BT7 bt7 = new BT7();
		T34 t34 = new T34();
		Tiger tiger = new Tiger();
		runTank.printTankInfo(tank);
		runTank.printTankInfo(bt7);
		runTank.printTankInfo(t34);
		runTank.printTankInfo(tiger);
	}
	
	public void printTankInfo(Tank tank) {

		System.out.println(tank.getClass() + " Tank color: " + tank.getColor() + " crew: " + tank.getCrew()
					+ " maxSpeed: " + tank.getMaxSpeed());
	}
}
