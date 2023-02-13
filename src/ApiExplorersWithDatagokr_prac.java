import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr_prac {
    public static void main(String[] args) throws UnsupportedEncodingException {

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /*URL*/
        // url을 https로 하면 ssl에러발생
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=").append("4N7pTLcoFmD4%2FrHmZ9dbtqAXAcOb1gc3Ry0z2Fwv0VpeANeuTyRO%2Bn15mHYeSUxkqPLpn5CgEGOwJYue4woijg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*type*/

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
