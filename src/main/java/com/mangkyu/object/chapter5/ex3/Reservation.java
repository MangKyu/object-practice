package com.mangkyu.object.chapter5.ex3;

public class Reservation {

    private final Customer customer;
    private final Screening screening;
    private final Money calculateFee;
    private final int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.calculateFee = fee;
        this.audienceCount = audienceCount;
    }
}
