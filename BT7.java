package lesson4.tankInheritance;

/**
 * Created by anna on 04.11.15.
 */
public class BT7 extends Tank {

    private int maxSpeed = 72;

    public BT7() {
    }

    public BT7(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
