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
    public void print(){
        System.out.println("Gear: "+gear+ "\nSpeed: "+ speed );
    }
}
class Bike implements Vehicle{
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
    public void print(){
        System.out.println("Gear: "+gear+ "\nSpeed: "+ speed );
    }
}


public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeGear(2);
        car.speedUp(254324654);
        car.applyBrakes(4534534);
        car.print();
    }

}
