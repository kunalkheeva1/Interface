interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Car implements Vehicle{
    int gear;
    int speed;
    public void changeGear(int newGear){
        gear= newGear;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public void applyBrakes(int decrement){
        speed= speed - decrement;
    }
}

public class Interface {
}
