package com.haidara.gamesandticketsservices.services.Ticket;

import com.haidara.gamesandticketsservices.dtos.inputDtos.TicketInputDto;
import com.haidara.gamesandticketsservices.dtos.outputDtos.TicketOutputDto;
import com.amghar.gamesandticketsservices.exceptions.custome.*;
import com.haidara.gamesandticketsservices.exceptions.custome.*;

public interface TicketServices {
    TicketOutputDto buyTicket(TicketInputDto ticketInputDto) throws MissingFieldsException, GameIdNotFoundException, TicketsSoldOutException;

    void validateTicket(String id) throws TicketIdNotFoundException, TicketAlreadyValidatedException;
}
