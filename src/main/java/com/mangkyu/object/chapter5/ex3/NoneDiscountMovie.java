package com.mangkyu.object.chapter5.ex3;

import java.time.Duration;
import java.util.List;

public class NoneDiscountMovie extends Movie {
    private double percent;

    public NoneDiscountMovie(String title, Duration runningTime, Money fee, double percent) {
        super(title, runningTime, fee, List.of());
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }

    @Override
    protected MovieType getMovieType() {
        return MovieType.NONE_DISCOUNT;
    }
}
