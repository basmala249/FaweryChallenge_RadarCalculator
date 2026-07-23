package CarTypes.BusCar;

public class BusCarRules {
    private double maxSpeed;

    public BusCarRules(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public ResultStruct checkBusCarSpeed(double speed) {
        if (speed > maxSpeed) {
            return new ResultStruct("speed of " + speed + " exceeded max allowed " + maxSpeed, 300.0);
        } else {
            return null;
        }
    }
}
