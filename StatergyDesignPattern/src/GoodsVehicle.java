import Statergy.DriveStatergy;
import Statergy.NormalDriveStatergy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStatergy());
    }
}
