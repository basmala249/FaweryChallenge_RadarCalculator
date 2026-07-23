package CarTypes.BusCar;
import CarTypes.BusCar.BusCarRules;

public class BusCar implements ICar {
    private double speed;
    private final BusCarRules busCarRules = new BusCarRules(80.0); 
    
    public BusCar() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public ResultStruct checkSpeed(double speed) {
        this.speed = speed;
        return busCarRules.checkBusCarSpeed(speed);
    }


}
