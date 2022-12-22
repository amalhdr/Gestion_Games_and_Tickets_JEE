package com.haidara.gamesandticketsservices.web;

import com.haidara.gamesandticketsservices.dtos.inputDtos.TicketInputDto;
import com.haidara.gamesandticketsservices.dtos.outputDtos.TicketOutputDto;
import com.amghar.gamesandticketsservices.exceptions.custome.*;
import com.haidara.gamesandticketsservices.services.Ticket.TicketServices;
import com.haidara.gamesandticketsservices.exceptions.custome.*;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketGraphqlController {
    private TicketServices ticketServices;

    @MutationMapping
    private TicketOutputDto getTicket(@Argument TicketInputDto ticketInputDto) throws GameIdNotFoundException, MissingFieldsException, TicketsSoldOutException {
        return ticketServices.buyTicket(ticketInputDto);
    }

    @MutationMapping
    private void updateTicket(@Argument String id) throws TicketIdNotFoundException, TicketAlreadyValidatedException {
        ticketServices.validateTicket(id);
    }
}
