import CarTypes.PrivateCar.PrivateCarRules;

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

    public ResultStruct checkSpeed(double speed) {
        this.speed = speed;
        return privateCarRules.checkPrivateCarSpeed(speed);
    }

}
