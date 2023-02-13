import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // https://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew
        // ?serviceKey=
        // &returnType=JSON
        // &numOfRows=10
        // &pageNo=1
        // &cond[country_nm::EQ]=중국

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew"); /*URL*/
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=").append("4N7pTLcoFmD4%2FrHmZ9dbtqAXAcOb1gc3Ry0z2Fwv0VpeANeuTyRO%2Bn15mHYeSUxkqPLpn5CgEGOwJYue4woijg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*XML 또는 JSON*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]","UTF-8") + "=" + URLEncoder.encode("중국", "UTF-8")); /*ISO 2자리코드*/

        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            // send를 던져서 답을 받는다
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty(null, null);
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader br = null;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <300){
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while((line = br.readLine()) != null){
                stringBuffer.append(line);
            }
            int i = 1;
            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            conn.disconnect();
        }
    }
}
