package com.company.design.singleton;

/**
 * SingleTon pattern
 * → 어떠한 클래스가 유일하게 1개만 존재 할 때 사용한다.
 * 서로 자원을 공유 할 때 사용. → 프린터
 * TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용됨.
 */
public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if(socketClient == null) socketClient = new SocketClient();
        return socketClient;
    }

    public void connect() {
        System.out.println(" connect ");
    }
}
