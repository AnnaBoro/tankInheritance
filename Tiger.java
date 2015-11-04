package lesson4.tankInheritance;

/**
 * Created by anna on 04.11.15.
 */
public class Tiger extends Tank {

    private int maxSpeed = 36;

    private int armor = 1;

    public Tiger() {
    }

    public Tiger(int maxSpeed, int armor) {
        this.maxSpeed = maxSpeed;
        this.armor = armor;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getArmor() {
        return armor;
    }
}
