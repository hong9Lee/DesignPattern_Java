package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.A3;
import com.company.design.decorator.Audi;
import com.company.design.decorator.ICar;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.Writer;
import com.company.design.facade.sftpClient;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Brower;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrower;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;

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



        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();




        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");



        Ftp ftpClient = new Ftp("www.naver.com", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisConnect();
        writer.fileDisConnect();
        reader.fileDisConnect();

        sftpClient sftpClient = new sftpClient("www.naver.com", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();

         */


        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();


        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);

        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }



}
