package inheritanceVehicles;
public class Main{
    public static void main(String[] args) {
    Vehicles vehicle = new Vehicles();
    // vehicle.speed(100,10);
    // vehicle.weight(10,100,1000);

    Vans van = new Vans();
    // van.speed(20, 4);
    // van.weight(5, 10, 20);
    // van.windows_count(2);

    Cars car = new Cars(4);
    // car.speed(30, 2);
    // car.weight(10, 8, 15);

    System.out.println("");
    }
}
