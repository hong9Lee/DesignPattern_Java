package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Writer %s 로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisConnect () {
        String msg = String.format("Writer %s 로 연결 끊습니다.", fileName);
        System.out.println(msg);
    }

    public void write() {
        String msg = String.format("Writer %s 로 씁~니다", fileName);
        System.out.println(msg);
    }


}
