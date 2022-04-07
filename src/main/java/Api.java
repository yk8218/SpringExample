import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Api {
    public static void main(String[] args) {

        // 인증키 (개인이 받아와야함)
        String key = "lMJlFCxftv8SYLp9kT%2BO8AbsbpXMh3wal3YC8O2eimlH7bRbT796Vj7N39fSOrgPEV471B2ou0KCyaw6WYUeYg%3D%3D";

        // 파싱한 데이터를 저장할 변수
        String result = "";

        try {

            URL url = new URL("http://apis.data.go.kr/1471000/FoodNtrIrdntInfoService1/getFoodNtrItdntList1?serviceKey=" + key + "&desc_kor=%EB%B0%94%EB%82%98%EB%82%98%EC%B9%A9&pageNo=1&numOfRows=3&bgn_year=2017&animal_plant=(%EC%9C%A0)%EB%8F%8C%EC%BD%94%EB%A6%AC%EC%95%84&type=json");

            BufferedReader bf;

            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            result = bf.readLine();


            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
            JSONObject body = (JSONObject)jsonObject.get("body");
            JSONArray items = (JSONArray)body.get("items");
            JSONObject  FoodInfo= (JSONObject)items.get(0);


           // String FoodNm = "";

            System.out.println("식품이름 : " + FoodInfo.get("DESC_KOR"));
            System.out.println("열량(kcal) : " + FoodInfo.get("NUTR_CONT1") + "g");
            System.out.println("탄수화물 : " + FoodInfo.get("NUTR_CONT2") + "g");
            System.out.println("단백질 : " + FoodInfo.get("NUTR_CONT3") + "g");
            System.out.println("지방 : " + FoodInfo.get("NUTR_CONT4") + "g");


        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}