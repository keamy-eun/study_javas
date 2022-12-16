import java.util.ArrayList;
import java.util.HashMap;

public class PracMain {
    public static void main(String[] args) {
        Prac dataInfor = new Prac();
        HashMap<String, Object> bundlesData = dataInfor.getBundlesData();
        // ArrayList<String> tablesListWithString = dataInfor.getTablesListWithString();
        // HashMap searchForm = dataInfor.getSearchformData();

        ArrayList<String> tablesListWithString = (ArrayList<String>) bundlesData.get("searchForm");
        HashMap<String, String> searchForm = (HashMap<String, String>) bundlesData.get("tablesListWithString");
        
        System.out.println(tablesListWithString.get(0));

    }
}
