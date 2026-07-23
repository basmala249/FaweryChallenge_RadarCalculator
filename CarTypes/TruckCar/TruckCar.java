package CarTypes.TruckCar;

import CarTypes.ICar;
import CarTypes.TruckCar.TruckCarRules;

public class TruckCar implements ICar {
    private double speed;
    private TruckCarRules privateCarRules = new TruckCarRules(60.0); 
    
    public TruckCar() {
    }
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public ResultStruct checkSpeed(double speed) {
        this.speed = speed;
        return privateCarRules.checkTruckCarSpeed(speed);
    }
}
