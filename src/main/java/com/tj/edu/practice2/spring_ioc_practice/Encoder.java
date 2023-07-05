package com.tj.edu.practice2.spring_ioc_practice;

public class Encoder implements IEncoder {
    private static IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    @Override
    public String encodeToString(String message) {
        return iEncoder.encodeToString(message);
    }

    @Override
    public byte[] encodeToByte(String message) {
        return iEncoder.encodeToByte(message);
    }
}
