package com.soufiane.json_to_objetct;

import com.soufiane.postRequest.ByteProblem;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class operationTest {
    @Test
    public void encryptionTest() throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        System.out.println(ByteProblem.sign("GET&%2F&AccessKeyId%3Dmy_access_key_id&Action%3DCreateToken&Format%3DJSON&RegionId%3Dcn-shanghai&SignatureMethod%3DHMAC-SHA1&SignatureNonce%3Db924c8c3-6d03-4c5d-ad36-d984d3116788&SignatureVersion%3D1.0&Timestamp%3D2019-04-18T08%253A32%253A31Z&Version%3D2019-02-28", "soufiane"));
    }
}
