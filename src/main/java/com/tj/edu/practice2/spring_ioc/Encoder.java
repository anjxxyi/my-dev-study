package com.tj.edu.practice2.spring_ioc;

public class Encoder implements IEncoder {

    private IEncoder iEncoder;

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
