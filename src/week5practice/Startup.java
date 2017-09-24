package week5practice;

public class Startup {

    public static void main(String[] args) {
        
        //can switch back and forth bewteen run and walk
        MoveAction move = new Run();
        //MoveAction move = new Walk();
        
        Character mario = new Character(move);
        
        mario.move("up");
    }
    
}
