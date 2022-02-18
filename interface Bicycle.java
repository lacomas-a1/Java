interface Bicycle {
    //wheel revolution per minute
    void changeCadence(int newValue);
    void speedUp(int increment);
    void changeGear(int newValue);
    void applyBrakes(int decrement);
}
//To implement this interface, the name of your class would change (to a particular brand of
// bicycle, for example, such as ACMEBicycle), and you'd use the implements keyword in the class
// declaration: