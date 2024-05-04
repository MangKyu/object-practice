package com.mangkyu.object.chapter2.ex1;

public class NoneDiscountPolicy extends DiscountPolicy {

    public NoneDiscountPolicy(DiscountCondition... conditions) {
        super(conditions);
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        // 부모 추상 클래스인 DiscountPolicy와 개념적으로 결합됨
        // 해당 클래스의 개발자는 getDiscountAmount()가 호출되지 않을 경우 ZERO를 반환할 것이라고 가정하고 있으므로
        return Money.ZERO;
    }
}
