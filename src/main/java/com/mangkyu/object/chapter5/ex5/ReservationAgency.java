package com.mangkyu.object.chapter5.ex5;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        boolean discountable = checkDiscountable(screening);
        Money fee = calculateFee(screening, audienceCount, discountable);

        return createReservation(screening, customer, audienceCount, fee);
    }

    private boolean checkDiscountable(Screening screening) {
        return screening
            .getMovie()
            .getDiscountConditions()
            .stream()
            .anyMatch(condition -> condition.isDiscountable(screening, this));
    }

    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee) {
        return new Reservation(customer, screening, fee, audienceCount);
    }

    private Money calculateFee(Screening screening, int audienceCount, boolean discountable) {
        if (discountable) {
            return screening.getMovie().getFee().minus(calculateDiscountedFee(screening.getMovie())).times(audienceCount);
        }

        return screening.getMovie().getFee().times(audienceCount);
    }

    private Money calculateDiscountedFee(Movie movie) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT -> {
                return calculateAmountDiscountedFee(movie);
            }
            case PERCENT_DISCOUNT -> {
                return calculatePercentDiscountedFee(movie);
            }
            case NONE_DISCOUNT -> {
                return calculateNoneDiscountedFee();
            }
        }

        throw new IllegalArgumentException();
    }

    private Money calculateAmountDiscountedFee(Movie movie) {
        return movie.getDiscountAmount();
    }

    private Money calculatePercentDiscountedFee(Movie movie) {
        return movie.getFee().times(movie.getDiscountPercent());
    }

    private Money calculateNoneDiscountedFee() {
        return Money.ZERO;
    }


}
