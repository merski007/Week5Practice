package week5practice;

public interface MoveAction {

    public abstract void moveCharacter(String direction, String speed);
    
    public abstract void setDirection(String direction);

    public abstract String getDirection();
    
    public abstract void setSpeed(String speed);
    
    public abstract String getSpeed();

}
