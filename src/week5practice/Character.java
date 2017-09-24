package week5practice;

/**
 *
 * @author mjmersenski
 */
public class Character {

    private MoveAction move;
    private WeaponAction attack;

    public Character(MoveAction move, WeaponAction attack) {
        this.move = move;
        this.attack = attack;
    }

}
