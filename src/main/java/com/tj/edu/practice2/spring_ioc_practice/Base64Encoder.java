package com.tj.edu.practice2.spring_ioc_practice;

import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Base64.Encoder;

@Component
public class Base64Encoder implements IEncoder {

    @Override
    public String encodeToString(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

    @Override
    public byte[] encodeToByte(String message) {
        Encoder encoder = Base64.getEncoder();
        byte[] encodeBytes = encoder.encode(message.getBytes());

        return encodeBytes;
    }
}
