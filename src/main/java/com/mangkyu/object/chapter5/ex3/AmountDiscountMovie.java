package com.mangkyu.object.chapter5.ex3;

import java.time.Duration;
import java.util.List;

public class AmountDiscountMovie extends Movie {
    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee, Money discountAmount, List<DiscountCondition> discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountAmount;
    }

    @Override
    protected MovieType getMovieType() {
        return MovieType.AMOUNT_DISCOUNT;
    }
}
