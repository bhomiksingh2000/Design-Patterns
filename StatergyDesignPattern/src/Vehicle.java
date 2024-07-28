import Statergy.DriveStatergy;
// vehicle is abstract class
public class Vehicle {

    // Vehicle class has a drive Stratergy :
    DriveStatergy driveObj ;

    // remember we are not doing like this : DriveStatergy driveStatergy = new NormalDriveStrategy();
    // because our object will become bound to this , code will not be reusable
    // and we would have to make a lot of objects like normal, sport etc



    // constructor injection
    // this is used to instantiate the object of DriveStatergy ,
    // so that later its function drive can be called
    Vehicle(DriveStatergy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }

}
