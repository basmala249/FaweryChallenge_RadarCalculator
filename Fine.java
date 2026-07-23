
import java.util.List;

public class Fine {
    private double fineAmount = 0.0;
    private String PlateNumber = "";
    private List<ResultStruct> violations;

    public Fine(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }
    public void getCarViolations(CarViolations carViolations) {
       violations = carViolations.getViolations(PlateNumber);
       for (ResultStruct violation : violations) {
            fineAmount += violation.getPrice();
        }
    }

    public Fine returnFine() {
        return this;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }
    
    
}
