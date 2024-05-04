package com.mangkyu.object.chapter2.ex2;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
//        기존 할인 정책의 경우에는 할인할 금액을 계산하는 책임이 DiscountPolicy의 자식 클래스에 있었지만, 할인 정책이 없는 경우는 Movie에 생김
//        if (discountPolicy == null) {
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
