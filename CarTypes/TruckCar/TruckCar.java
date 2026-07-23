package CarTypes.TruckCar;

import CarTypes.ICar;
import CarTypes.ResultStruct;

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

    @Override
    public ResultStruct checkSpeed(double speed) {
        this.speed = speed;
        return privateCarRules.checkTruckCarSpeed(speed);
    }
}
