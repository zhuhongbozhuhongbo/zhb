package fastjson_test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastJsonTest {

    public static void main(String[] args){


        // getCity(toParse);
    }


    public static City getCity(String json) {
        JSONObject jsonObject = (JSONObject) JSONObject.parseObject(json)
                .getJSONObject("data")
                .getJSONObject("city");
        City city = new City();
        city.setCityId(Integer.parseInt(String.valueOf(jsonObject.get("cityId"))));
        city.setCityName((String) jsonObject.get("pname"));
        city.setCunName((String) jsonObject.get("counname"));
        city.setDistrictName((String) jsonObject.get("name"));
        return city;
    }

  /*  public static List<Life> getLife(String lifeJson) {
        List list = new ArrayList();
        JSONObject jsonObject = (JSONObject) JSONObject.parseObject(lifeJson)
                .getJSONObject("data")
                .getJSONObject("liveIndex");
        JSONArray jsonArray = jsonObject.getJSONArray(getFormatDate());
        for (int i = 0; i < 8; i++) {
            Life life = new Life();
            life.setDay(new Date());
            life.setDesc(jsonArray.getJSONObject(i).getString("desc"));
            life.setName(jsonArray.getJSONObject(i).getString("name"));
            life.setStatus(jsonArray.getJSONObject(i).getString("status"));
            life.setCity(getCity(lifeJson));
            list.add(life);
        }
        return list;
    }*/

}
