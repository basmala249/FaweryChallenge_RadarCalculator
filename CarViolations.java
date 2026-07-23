import CarTypes.ResultStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Singleton Class to Have All Violations and Fines for Cars
public class CarViolations {
    private static CarViolations instance = null;
    Map<String , List<ResultStruct>> violations = null;
    private List<Fine> fines = null;
    private CarViolations() {
        
    }
    public static CarViolations getInstance() {
        if (instance == null) {
            instance = new CarViolations();
            instance.violations = new HashMap<>();
            instance.fines = new ArrayList<>();
        }
        return instance;
    }


    public void addViolation(String CarPlateNumber, ResultStruct res) {
        if (!violations.containsKey(CarPlateNumber)) {
            violations.put(CarPlateNumber, new ArrayList<>());
        }
        violations.get(CarPlateNumber).add(res);
        
    }

    public List<ResultStruct> getViolations(String CarPlateNumber) {
        return violations.get(CarPlateNumber);
    }

    public Map<String, List<ResultStruct>> getAllViolations() {
        return violations;
    }

    public List<Fine> getFines() {
        return fines;
    }
    public void addFine(Fine fine) {
        fines.add(fine);
    }
}
