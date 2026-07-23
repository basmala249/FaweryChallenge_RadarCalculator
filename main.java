import java.util.List;
import java.util.Map;
import CarTypes.PrivateCar.PrivateCar;

public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar("2023/07/19", "ABC123", SeatBeltStatus1.UNFASTENED, new PrivateCar(), 100);
        CarViolations carViolations = CarViolations.getInstance();
        
        radar.doRadarChecks(carViolations);
        carViolations.getAllViolations().forEach((plateNumber, violations) -> {
            System.out.println("Plate Number: " + plateNumber + ", Violations Count: " + violations.size());

            for (ResultStruct violation : violations) {
                System.out.println("Violation: " + violation.getMessage() + ", Price: " + violation.getPrice());
            }
        });

        carViolations.getFines().forEach(fine -> {
            System.out.println("Fine for Plate Number: " + fine.getPlateNumber() + ", Total Fine Amount: " + fine.getFineAmount());
        });

    }
}