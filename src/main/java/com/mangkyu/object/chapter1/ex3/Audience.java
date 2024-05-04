package com.mangkyu.object.chapter1.ex3;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

}
