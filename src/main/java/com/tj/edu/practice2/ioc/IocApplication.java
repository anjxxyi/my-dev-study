package com.tj.edu.practice2.ioc;

public class IocApplication {
    public static void main(String[] args) {
        // IoC (Inversion Of Controll(제어의 역전) -> 클래스 생성 주입에 관한 내용

        String url = "https://www.naver.com";

        Encoder encoderURL = new Encoder(new UrlEncoder());
        String resultUrlStr = encoderURL.encodeToString(url);
        byte[] resultUrlByte = encoderURL.encodeToByte(url);

        Encoder encoderBase64 = new Encoder(new Base64Encoder());
        String resultB64Str = encoderBase64.encodeToString(url);
        byte[] resultB64Byte = encoderBase64.encodeToByte(url);

        System.out.println(">> URL result(String) : " + resultUrlStr);
        System.out.println(">> URL result(Byte) : " + resultUrlByte + "\n");

        System.out.println(">> Base64 result(String) : " + resultB64Str);
        System.out.println(">> Base64 result(Byte) : " + resultB64Byte);

    }
}
