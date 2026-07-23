package CarTypes.PrivateCar;

import CarTypes.ICar;
import CarTypes.ResultStruct;

public class PrivateCar implements ICar {
    private double speed;
    private PrivateCarRules privateCarRules = new PrivateCarRules(80.0); 
    
    public PrivateCar() {
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
        return privateCarRules.checkPrivateCarSpeed(speed);
    }
}