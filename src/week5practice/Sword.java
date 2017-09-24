package week5practice;

public class Sword implements WeaponAction {

    private boolean attack;

    @Override
    public boolean slash(boolean attack) {
        return attack;
    }
}
