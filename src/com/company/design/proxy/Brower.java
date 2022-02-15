package com.company.design.proxy;

/**
 * ㄷㅐ리인이라는 뜻으로써, 뭔가를 대신해서 처리한다.
 * Proxy Class를 통해서 대신 전달 하는 형태로 설계되며, proxy로 부터 결과를 받는다.
 * Cache의 기능으로도 활용이 가능하다.
 * 개방폐쇄(OCP), 의존역전(DIP)를 따른다.
 * */
public class Brower implements IBrower{

    private String url;


    public Brower(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println(" loding,,, " + url);
        return new Html(url);
    }
}
