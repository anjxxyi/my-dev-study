package com.tj.edu.practice2.ioc;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Encoder implements IEncoder {
    public Base64Encoder() {}

    @Override
    public String encodeToString(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

    @Override
    public byte[] encodeToByte(String message) {
        Encoder encoder = Base64.getEncoder();
        byte[] encodedBytes = encoder.encode(message.getBytes());
        return encodedBytes;
    }
}
