package lesson4.tankInheritance;

/**
 * Created by anna on 04.11.15.
 */
public class T34 extends Tank {

    private int maxSpeed = 50;

    public T34() {
    }

    public T34(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
