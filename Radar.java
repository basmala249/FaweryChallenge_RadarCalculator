import CarTypes.ICar;

public class Radar {
    private ICar car;
    private long speedLimit;
    private String PlateNumber;
    private String Date;
    private SeatBeltStatus1 SeatBeltStatus;
    


    public Radar(String Date, String PlateNumber, SeatBeltStatus1 SeatBeltStatus, ICar car, long speedLimit) {
        this.Date = Date;
        this.PlateNumber = PlateNumber;
        this.SeatBeltStatus = SeatBeltStatus;
        this.car = car;
        this.speedLimit = speedLimit;
    }

    public ICar getCar() {
        return car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }

    public long getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(long speedLimit) {
        this.speedLimit = speedLimit;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        PlateNumber = plateNumber;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public SeatBeltStatus1 getSeatBeltStatus() {
        return SeatBeltStatus;
    }

    public void setSeatBeltStatus(SeatBeltStatus1 seatBeltStatus) {
        SeatBeltStatus = seatBeltStatus;
    }

    public Fine doRadarChecks(CarViolations carViolations) {
        if(this.CheckSeatBeltViolation()) {
            ResultStruct res = new ResultStruct("Seatbelt not fastened", 100.0);
            carViolations.addViolation(this.PlateNumber, res);
        }
        ResultStruct res = car.checkSpeed(this.speedLimit);
        if (res != null) {  
            carViolations.addViolation(this.PlateNumber, res);
        }
        Fine fine = new Fine(this.PlateNumber);
        return fine.returnFine();
    }

    public boolean CheckSeatBeltViolation() {
        if (this.SeatBeltStatus == SeatBeltStatus1.UNFASTENED) {
            return true;
        }
        return false;
    }
    
}

enum SeatBeltStatus1 {
    FASTENED,
    UNFASTENED
}
