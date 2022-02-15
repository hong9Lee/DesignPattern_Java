package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.Brower;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrower;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        /*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient BClient = bClazz.getSocketClient();

        System.out.println(" 동일한가? ");
        System.out.println(aClient.equals(BClient));
        */

        /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter1 = new SocketAdapter(airConditioner);
        connect(adapter1);
        */

        /*
        Brower brower = new Brower("www.naver.com");
        brower.show();


        IBrower brower = new BrowserProxy("www.naver.com");
        brower.show();
        brower.show();
        brower.show();
        brower.show();
        */

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrower aopBrowser = new AopBrowser("google.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
                );

        aopBrowser.show();
        System.out.println("loding time => " + end.get());

        aopBrowser.show();
        System.out.println("loding time => " + end.get());
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }



}
