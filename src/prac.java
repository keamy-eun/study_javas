import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class prac {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 2);
        map.put(-1, 2);
        map.put(-11, 2);
        map.put(-111, 2);
        map.put(-21, 2);
        map.put(12, 2);
        map.put(18, 2);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
          }
    }
    
}
