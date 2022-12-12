package inheritanceVehicles;
public class Cars extends Vehicles{
    int oneway_count = 0;
    Cars(int oneway_conunt){
        this.oneway_count = oneway_conunt;
    }

    public int speed(int kms, int hours){
        int result = (kms/hours) + oneway_count;
        return result;
    }
}
