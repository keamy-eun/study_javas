import java.util.HashMap;
import java.util.Map.Entry;

public class PracMain {
    public static void main(String[] args) {
        HashMap<String, Object> answer = new HashMap();
        answer.put("ORDERS", 1);
        answer.put("ORDERS", 2);
        answer.put("EXAMPLE", "EXAMPLE");
        answer.put("EXAMPLE_UID", "EXAMPLE_UID");

        for (Entry<String, Object> entrySet : answer.entrySet()) {
    int order = (int) answer.get("ORDERS");
    String examples = (String) answer.get("EXAMPLE");
    String examples_uid = (String) answer.get("EXAMPLE_UID");
    System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
    System.out.println("order : "+order + ", "+examples+", "+examples_uid);
        }
    }
}

    
