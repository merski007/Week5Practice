package week5practice;

/**
 *
 * @author mjmersenski
 */
public class Walk implements MoveAction {

    private String direction;

    @Override
    public void moveCharacter(String direction) {
        //not suppose to do output here, but this is practice  
        System.out.println("The chacter moved 1 space in the " + direction + " direction.");
    }

}
