import Statergy.DriveStatergy;
import Statergy.SportsDriveStratergy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStratergy());
    }





    /* so as we know that we have a parameterized constructor for the parent class of OffRoadVehicle
    and java always calls super() [as child class constructor always invokes the parent class constructor]
    we would have to explicitly  call the parent class constructor with valid arguments.


    super(driveObj);  => instead we would be creating the object of the class we want the particular drive stratergy

    therefore here we would create the object of SportsDriveStratergy :
    eg : super(new SportsDriveStratergy())

    this is equivalent to DriveStatergy driveObj = new SportsDriveStratergy();
     */
}
