package cooking;
public class Microwave extends Cooker implements Powered {
    public String cook() {
        return "Cooking by spinning polar molecules!";
    }
    boolean powered; 
    
    @Override
    public void powerOn() {
        powered = true;
        
    }
    @Override
    public boolean isTurnedOn() {
        return powered;
    }
    
}