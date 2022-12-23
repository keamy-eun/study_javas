import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Prac {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sd");
        map.put(1, "sdfwef");
        map.put(2, "sssd");
        System.out.println(map.get(1)+" "+map.get(2));
    }
}
