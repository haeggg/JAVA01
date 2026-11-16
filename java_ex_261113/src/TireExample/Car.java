package TireExample;

public class Car{
    
    /*
    Tire frontLefTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();
    */

    Tire[] tires = {
        new HankookTire(),
        new HankookTire(),
        new HankookTire(),
        new HankookTire()
    };

    String[] locations = {
        "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽"
    };


    void run(){
        
        for(int i = 0 ; i < tires.length; i++){

            tires[i].roll(locations[i]);

        }
        // frontLefTire.roll("앞왼쪽");
        // frontRightTire.roll("앞오른쪽");
        // backLeftTire.roll("뒤왼쪽");
        // backRightTire.roll("뒤오른쪽");
    }
    
}
