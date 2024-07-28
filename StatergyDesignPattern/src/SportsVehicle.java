import Statergy.DriveStatergy;
import Statergy.SportsDriveStratergy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStratergy());
    }
}
