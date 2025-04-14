import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class jsonexample{
    public static void main(String[] args) {
        String urlString = "https://opendata.cwa.gov.tw/api/v1/rest/datastore/F-D0047-019?Authorization=CWA-41681140-70CE-4EBB-9A27-47FEBA729885";

        try {
            // 建立 URL 物件
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // 讀取回應
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // 輸出 JSON 結果
            System.out.print("API 回應內容：");
            
            System.out.print(response.toString());
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
