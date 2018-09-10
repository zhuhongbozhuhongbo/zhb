package gpsdecode;

import java.util.Base64;

public class GPSDecode {
    public static void main(String[] args) {
        String haha = "LPc/elV+uCI=";
        byte[] haha1 = Base64.getDecoder().decode(haha);
        System.out.println("   f" + haha1);

        System.out.println("size:" + haha1.length + "   " + haha1[0]);
        System.out.println("before" + ByteCompile.byte2Int(haha1[4], haha1[5], haha1[6], haha1[7]
        ) * 180.0 / Integer.MAX_VALUE + "," + ByteCompile.byte2Int(haha1[0], haha1[1], haha1[2], haha1[3]
        ) * 90.0 / Integer.MAX_VALUE);


        String gaga = "LLFEQ1V/7g4=";
        byte[] gaga1 = Base64.getDecoder().decode(gaga);
        System.out.println("   f" + gaga1);

        System.out.println("size:" + gaga1.length + "   " + gaga1[0]);
        System.out.println("after" + ByteCompile.byte2Int(gaga1[4], gaga1[5], gaga1[6], gaga1[7]
        ) * 180.0 / Integer.MAX_VALUE + "," + ByteCompile.byte2Int(gaga1[0], gaga1[1], gaga1[2], gaga1[3]
        ) * 90.0 / Integer.MAX_VALUE);

    }
}
