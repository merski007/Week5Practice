package week5practice;

/**
 *
 * @author mjmersenski
 */
public class Character {

    private MoveAction move;
    //private WeaponAction attack;

    public Character(MoveAction move) {
        this.move = move;
    }
    
    public void move(String direction){
        move.moveCharacter(direction);
    }

}
