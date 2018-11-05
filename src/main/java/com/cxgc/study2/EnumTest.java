package com.cxgc.study2;

public class EnumTest {
    public void judge(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }

    public static void main(String[] args){
        for(SeasonEnum s: SeasonEnum.values()){
            System.out.println(s);
        }
        new EnumTest().judge(SeasonEnum.SPRING);
    }
}
