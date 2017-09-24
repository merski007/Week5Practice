package week5practice;

public class Startup {

    public static void main(String[] args) {
        MoveAction move = new Walk();
        
        Character mario = new Character(move);
        
        mario.move("up");
    }
    
}
