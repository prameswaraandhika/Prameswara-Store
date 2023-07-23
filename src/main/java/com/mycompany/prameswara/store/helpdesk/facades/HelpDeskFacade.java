package com.mycompany.prameswara.store.helpdesk.facades;

import com.mycompany.prameswara.store.helpdesk.enteties.SupportTicket;

public interface HelpDeskFacade {

    void addNewSupportTicket(SupportTicket supportTicket);

    SupportTicket getNextSupportTicket();

    /**
     * @return amount of tickets that are not processed
     */
    int getNumberOfTickets();
}
