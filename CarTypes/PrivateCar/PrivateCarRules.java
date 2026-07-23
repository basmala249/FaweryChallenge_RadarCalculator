package CarTypes.PrivateCar;

public class PrivateCarRules {
    double maxSpeed;
    public PrivateCarRules(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public ResultStruct checkPrivateCarSpeed(double speed) {
        if (speed > maxSpeed) {
            return new ResultStruct("speed of " + speed + " exceeded max allowed " + maxSpeed, 300.0);
        } else {
            return null;
        }
    }
}
