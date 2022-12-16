import java.util.ArrayList;
import java.util.HashMap;

public class Prac {
    
        public HashMap<String, String> getSearchformData(){
            HashMap<String, String> searchForm = new HashMap<String, String>();
            searchForm.put("search_key","Search Title");
            searchForm.put("name","은원기");
            searchForm.put("id","ID0001");
            return searchForm;
        }


        public ArrayList<String> getTablesListWithString(){
            ArrayList<String> tablesListWithString = new ArrayList<>();
            tablesListWithString.add("@mdo");
            tablesListWithString.add("@fat");
            tablesListWithString.add("@twitter");
            return tablesListWithString;
        }

        public HashMap<String, Object> getBundlesData(){
            Prac datasInfo = new Prac();
            HashMap<String, String> map = datasInfo.getSearchformData();
            ArrayList<String> list = datasInfo.getTablesListWithString();

            HashMap<String, Object> bundlesData = new HashMap<>();
            bundlesData.put("searchForm", map);
            bundlesData.put("tablesListWithString", list);
            return bundlesData;
        }
    
}

