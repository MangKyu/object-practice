package com.mangkyu.object.chapter1.ex3;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }

}
