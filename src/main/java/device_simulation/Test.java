package device_simulation;

import java.security.MessageDigest;
public class Test {

    public static void main(String[] args) {
        int a = 0xfafbfcfd;
        char b = (char) ((a >> 24) & 0xff);

        char c = 0xfb;

        System.out.println("hello");
        System.out.println("aaa1 " + Integer.toBinaryString(a));
        System.out.println("aaa2 " + Integer.toHexString(a));
        System.out.println("aaa3 " + Integer.toBinaryString((a >>> 24) & 0xff));
        System.out.println("aaa4 " + Integer.toHexString((a >>> 24) & 0xff));
        System.out.println("aaa5 " + Integer.toBinaryString((a >>> 16) & 0xff));
        System.out.println("aaa6 " + Integer.toHexString((a >>> 16) & 0xff));
        System.out.println("aaa7 " + Integer.toBinaryString((a >>> 8) & 0xff));
        System.out.println("aaa8 " + Integer.toHexString((a >>> 8) & 0xff));
        System.out.println("aaa9 " + Integer.toBinaryString((a) & 0xff));
        System.out.println("aaa0 " + Integer.toHexString((a) & 0xff));
        System.out.println("aaaa " + b);
        System.out.println("aaaa " + (int)b);
        System.out.println("aaac " + c);
        System.out.println("aaac " + (int)c);
    }

    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

    public static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();

    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}