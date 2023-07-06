package com.tj.edu.practice2.spring_ioc;

public interface IEncoder {
    String encodeToString(String message);
    byte[] encodeToByte(String message);
}
