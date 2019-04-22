package com.soufiane.postRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


public class ByteProblem {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        System.out.println(sign("GET&%2F&AccessKeyId%3Dmy_access_key_id&Action%3DCreateToken&Format%3DJSON&RegionId%3Dcn-shanghai&SignatureMethod%3DHMAC-SHA1&SignatureNonce%3Db924c8c3-6d03-4c5d-ad36-d984d3116788&SignatureVersion%3D1.0&Timestamp%3D2019-04-18T08%253A32%253A31Z&Version%3D2019-02-28", "soufiane"));
    }
    public static String sign(String messages, String key ) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(
                key.getBytes("UTF-8"),
                "HmacSHA1"
        ));
        byte[] signData = mac.doFinal(messages.getBytes("UTF-8"));
        String signBase64 = DatatypeConverter.printBase64Binary(signData);
        System.out.println("Result in JAVA:" + signBase64);
        return signBase64;
    }
}
