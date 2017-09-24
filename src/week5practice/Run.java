package week5practice;

/**
 *
 * @author mjmersenski
 */
public class Run implements MoveAction {

    private String direction;
    private String speed;

    @Override
    public void moveCharacter(String direction, String speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDirection(String direction) {
        if (direction == null || direction.isEmpty()) {
            throw new IllegalArgumentException("cannot be left blank");
        }
        this.direction = direction;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    @Override
    public void setSpeed(String speed) {
        if (direction == null || direction.isEmpty()) {
            throw new IllegalArgumentException("cannot be left blank");
        }
        this.speed = speed;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

}
