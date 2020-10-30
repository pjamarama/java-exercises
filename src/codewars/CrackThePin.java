package codewars;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CrackThePin {
    public static void main(String[] args) {
        String pin = "password123";
        System.out.println(md5Custom(pin));
    }

    public static String crack(String hash) {
        // C0d3 g03s h3r3
        return null;
    }

    public static String md5Custom(String st) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }
}
