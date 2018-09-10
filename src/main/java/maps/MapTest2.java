package maps;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("java", 109);
        map.put("ios", 99);
        map.put("ajax", 79);

        map.replace("java", 60);
        System.out.println(map);


    }
}
