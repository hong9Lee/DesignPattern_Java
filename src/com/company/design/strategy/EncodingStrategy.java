package com.company.design.strategy;

/*
Strategy Pattern
유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여 유연하게 확장하는 패턴
 */
public interface EncodingStrategy {
    String encode(String text);
}
