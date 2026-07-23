package CarTypes.TruckCar;
import CarTypes.ResultStruct;
public class TruckCarRules {
    double maxSpeed;
    public TruckCarRules(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public ResultStruct checkTruckCarSpeed(double speed) {
        if (speed > maxSpeed) {
            return new ResultStruct("speed of " + speed + " exceeded max allowed " + maxSpeed, 300.0);
        } else {
            return null;
        }
}
}