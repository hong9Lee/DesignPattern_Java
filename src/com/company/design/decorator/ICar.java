package com.company.design.decorator;

/*
기존 클래스는 유지하되, 이후 필요한 형태로 꾸밀 때 사용한다.
확장이 필요한 경우 상속의 대안으로 활용.
개방폐쇄 원칙 OCP 와 의존 역전 원칙 DIP를 따른다.
*/
public interface ICar {

    int getPrice();
    void showPrice();

}
