package com.tj.edu.practice2.ioc;

public interface IEncoder {
    String encodeToString(String message);
    byte[] encodeToByte(String message);
}
