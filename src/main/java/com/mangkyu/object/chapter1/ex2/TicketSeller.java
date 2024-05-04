package com.mangkyu.object.chapter1.ex2;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        ticketOffice.plusAmount(audience.buy(ticket));;
    }

}
