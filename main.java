import CarTypes.PrivateCar.PrivateCar;
import CarTypes.ResultStruct;
public class Main {
    public static void main(String[] args) {

        // First Car
        Radar radar1 = new Radar("2023/07/19", "ABC123", SeatBeltStatus1.UNFASTENED, new PrivateCar(), 94);
        CarViolations carViolations = CarViolations.getInstance();
        
        Fine fine1 = radar1.doRadarChecks(carViolations);

        // Fine Generation
        System.out.println("Fine Traffic for Car " + fine1.getPlateNumber() + "\nTotal amount: " + fine1.getFineAmount() + " EGP" + "\nViolations : \n" + carViolations.getViolations(fine1.getPlateNumber())
                .stream()
                .map(violation -> violation.getMessage() + " : " + violation.getPrice() + " EGP")
                .reduce("", (acc, violation) -> acc + violation + "\n"));

        
        // Second Car
        Radar radar2 = new Radar("2023/07/19", "ABC121", SeatBeltStatus1.FASTENED, new PrivateCar(), 94);
        
        Fine fine2 = radar2.doRadarChecks(carViolations);

        // Fine Generation
        System.out.println("Fine Traffic for Car " + fine2.getPlateNumber() + "\nTotal amount: " + fine2.getFineAmount() + " EGP" + "\nViolations : \n" + carViolations.getViolations(fine2.getPlateNumber())
                .stream()
                .map(violation -> violation.getMessage() + " : " + violation.getPrice() + " EGP")
                .reduce("", (acc, violation) -> acc + violation + "\n"));
        
        
        System.out.println("\nAll Violations:");    

        carViolations.getAllViolations().forEach((plateNumber, violations) -> {
        System.out.println("Plate Number: " + plateNumber + ", Violations Count: " + violations.size());

            for (ResultStruct violation : violations) {
                System.out.println("Violation: " + violation.getMessage() + ", Price: " + violation.getPrice());
            }
        });

        System.out.println("\nAll Fines:");
        carViolations.getFines().forEach(f -> {
            System.out.println("\nPlate Number: " + f.getPlateNumber() + ", Fine Amount: " + f.getFineAmount());
        });
    }
}