public class ACMEBicycle implements Bicycle{

    int cadence=0;
    int speed =0;
    int gear =1;

    //the complier will now require that methods.
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    void changeCadence(int newValue){
        cadence=newValue;
    }
    void speedUp(int increment){
        speed=speed + increment;
    }
    void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    void printStates(){
        System.out.println("cadence: " + cadence +" speed: " + speed +" gear: " + gear);
    }
}
