package com.tj.edu.practice2.ioc;

import java.net.URLEncoder;

public class UrlEncoder implements IEncoder {

    public UrlEncoder() {}

    @Override
    public String encodeToString(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] encodeToByte(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8").getBytes();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
