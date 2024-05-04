package com.mangkyu.object.chapter2.ex1;

import java.util.List;

public abstract class DiscountPolicy {

    private final List<DiscountCondition> conditions;

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = List.of(conditions);
    }

    Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
