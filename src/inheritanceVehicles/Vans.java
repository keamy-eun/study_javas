package inheritanceVehicles;
public class Vans extends Vehicles{
    Vans(){}

    public int windows_count(int oneway_conunt){
        int result = oneway_conunt*3;
        return result;
    }
}
