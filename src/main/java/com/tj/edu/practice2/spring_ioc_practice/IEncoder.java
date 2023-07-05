package com.tj.edu.practice2.spring_ioc_practice;

public interface IEncoder {
    String encodeToString(String message);
    byte[] encodeToByte(String message);
}
