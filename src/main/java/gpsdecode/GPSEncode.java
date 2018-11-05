package gpsdecode;

import java.util.Base64;

public class GPSEncode {
    public static void main(String[] args){
        System.out.println(encode(119.635115,32.272224));//经度在前纬度在后
        System.out.println(encode(119.661207,32.272224));//经度在前纬度在后
        System.out.println(encode(119.661207,32.255096));//经度在前纬度在后
        System.out.println(encode(119.636488,32.249579));//经度在前纬度在后

        System.out.println(encode(119.645682,32.263611));//经度在前纬度在后
        System.out.println(encode(119.646122,32.263624));//经度在前纬度在后
        System.out.println(encode(119.646122,32.263624));//经度在前纬度在后
        System.out.println(encode(119.647324,32.263647));//经度在前纬度在后

        System.out.println(encode(119.646273,32.263892));//经度在前纬度在后
        System.out.println(encode(119.646594,32.263611));//经度在前纬度在后
        System.out.println(encode(119.646696,32.263515));//经度在前纬度在后
        System.out.println(encode(119.647206,32.263066));//经度在前纬度在后




    }

    /**
     *经纬度转换为数据库存储的地址格式（BASE64）
     * * @param lg 经度 如：129.323872
     * @param lt 纬度 如：43.742816
     */
    public static String encode(double lg, double lt){
        byte[] GPSdata = new  byte[8];
        int[] GPSdata0 = new int[8];

        lt = lt * 23860929.411111111;
        lg = lg * 11930464.705555555;

        GPSdata0[0] = (int)lt & 0xff000000;
        GPSdata0[1] = (int)lt & 0x00ff0000;
        GPSdata0[2] = (int)lt & 0x0000ff00;
        GPSdata0[3] = (int)lt & 0x000000ff;

        GPSdata0[4] = (int)lg & 0xff000000;
        GPSdata0[5] = (int)lg & 0x00ff0000;
        GPSdata0[6] = (int)lg & 0x0000ff00;
        GPSdata0[7] = (int)lg & 0x000000ff;


        GPSdata[0] = (byte)(GPSdata0[0] >> 24);
        GPSdata[1] = (byte)(GPSdata0[1] >> 16);
        GPSdata[2] = (byte)(GPSdata0[2] >> 8);
        GPSdata[3] = (byte)(GPSdata0[3]);

        GPSdata[4] = (byte)(GPSdata0[4] >> 24);
        GPSdata[5] = (byte)(GPSdata0[5] >> 16);
        GPSdata[6] = (byte)(GPSdata0[6] >> 8);
        GPSdata[7] = (byte)(GPSdata0[7]);
        String encoded = Base64.getEncoder().encodeToString(GPSdata);

        return encoded;
    }



}
