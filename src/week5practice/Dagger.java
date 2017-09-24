package week5practice;

/**
 *
 * @author mjmersenski
 */
public class Dagger implements WeaponAction {

    private boolean attack;

    @Override
    public boolean slash(boolean attack) {
        return attack;
    }

}
