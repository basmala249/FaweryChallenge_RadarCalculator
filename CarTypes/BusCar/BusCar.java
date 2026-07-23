package CarTypes.BusCar;

import CarTypes.ICar;
import CarTypes.ResultStruct;

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

    @Override
    public ResultStruct checkSpeed(double speed) {
        this.speed = speed;
        return busCarRules.checkBusCarSpeed(speed);
    }


}
