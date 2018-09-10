package GPS;


import java.util.Base64;
import static java.lang.StrictMath.log;
import static java.lang.StrictMath.tan;

public class Miller_projection {


    public static double M_PI = 3.14159265358979323846;

    /**
     * 米勒投影转换
     * @param lon
     * @param lat
     * @return
     */
    public static double[] MillierConvertion(double lon, double lat)//如：116.40741300000002（longitude)
    // ,39.904214(latitude)
    {
        double L = 6381372 * M_PI * 2;//地球周长
        double W = L;// 平面展开后，x轴等于周长
        double H = L / 2;// y轴约等于周长一半
        double mill = 2.3;// 米勒投影中的一个常数，范围大约在正负2.3之间
        double x = lon * M_PI / 180;// 将经度从度数转换为弧度
        double y = lat * M_PI / 180;// 将纬度从度数转换为弧度
        y = 1.25 * log(tan(0.25 * M_PI + 0.4 * y));// 米勒投影的转换
        // 弧度转为实际距离
        x = (W / 2) + (W / (2 * M_PI)) * x;
        y = (H / 2) - (H / (2 * mill)) * y * (-1);
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    /**
     *
     * @param start 起始点的经过Base64编码的经纬度
     * @param stop  终止点的经过Base64编码的经纬度
     * @return
     */
    public static double convert(String start, String stop){

        byte[] haha1 = Base64.getDecoder().decode(stop);
        byte[] gaga1 = Base64.getDecoder().decode(start);


        double lat1 = ByteCompile.byte2Int(haha1[0], haha1[1], haha1[2], haha1[3]
        ) * 90.0 / Integer.MAX_VALUE;
        double long1 = ByteCompile.byte2Int(haha1[4], haha1[5], haha1[6], haha1[7]
        ) * 180.0 / Integer.MAX_VALUE;

        double lat2 = ByteCompile.byte2Int(gaga1[0], gaga1[1], gaga1[2], gaga1[3]
        ) * 90.0 / Integer.MAX_VALUE;
        double long2 = ByteCompile.byte2Int(gaga1[4], gaga1[5], gaga1[6], gaga1[7]
        ) * 180.0 / Integer.MAX_VALUE;



        double[] materialA = MillierConvertion(long1, lat1);//结束点
        double[] materialB = MillierConvertion(long2, lat2);

        double deltaY = materialA[1] - materialB[1];
        double deltaX = materialA[0] - materialB[0];
        double deltaDistance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        System.out.println("经纬度1 " + long1 + "," + lat1);
        System.out.println("经纬度2 " + long2 + "," + lat2);
        System.out.println("x距离： "+ deltaX + " y距离： " + deltaY);
        System.out.println("距离： "+ deltaDistance);

        return deltaDistance;
    }



    public static void main(String args[]) {
        double deltaDistance = convert("LLFM6FV/6oM=", "LLFVV1V/6t4=");


    }

}
