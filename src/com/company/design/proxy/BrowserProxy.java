package com.company.design.proxy;

public class BrowserProxy implements IBrower{

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        if (html == null) {
            this.html = new Html(url);
            System.out.println(" BrowerProxy loding ,,, " + url);
        }

        System.out.println(" Browser caching ,,,  " + url );
        return html;
    }
}
