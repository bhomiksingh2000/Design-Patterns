import Statergy.DriveStatergy;
import Statergy.SportsDriveStratergy;

public class Main {
    public static void main(String[] args) {

        /*
        internally what we are doing here is that , we are making a SportsVehicle object , then
        the constructor of the SportsVehicle will be called , and inside that we have super constructor
        of the parent class Vehicle , and inside the constructor of Vehicle through constructor injection we
        have instantiated the object of DriveStratergy , and jo object humne super mai pass kia hoga ,
        usi ka object instantiate ho jaega
         */
        Vehicle ferrari = new SportsVehicle();
        ferrari.drive();

        Vehicle truck = new GoodsVehicle();
        truck.drive();

        Vehicle thar = new OffRoadVehicle();
        thar.drive();


    }
}