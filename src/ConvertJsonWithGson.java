import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        // 문자열 Json -> (Array,Map) Gson
        Gson gson = new Gson();
        String jsonStr = "{id:1, name:keamy}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);

        // (Array,Map) Gson -> 문자열 Json
        String mapStr = gson.toJson(jsonMap);
        
        // 문자열 Json -> Bean(bean, model, vo) Gson
        String jsonStrBean = "{firstName:wonki, secondName:eun, handleName:keamy}";
        MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);
        int i = 0;
    }
}
