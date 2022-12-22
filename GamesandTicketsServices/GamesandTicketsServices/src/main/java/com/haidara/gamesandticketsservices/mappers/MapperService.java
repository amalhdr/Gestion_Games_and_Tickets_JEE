package com.haidara.gamesandticketsservices.mappers;

import com.haidara.gamesandticketsservices.dtos.outputDtos.GameOutputDto;
import com.haidara.gamesandticketsservices.dtos.outputDtos.TicketOutputDto;
import com.haidara.gamesandticketsservices.entities.Game;
import com.haidara.gamesandticketsservices.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class MapperService {
    public GameOutputDto fromGame(Game game){
        GameOutputDto gameOutputDto = new GameOutputDto();
        BeanUtils.copyProperties(game, gameOutputDto);
        return  gameOutputDto;
    }

    public TicketOutputDto fromTicket(Ticket ticket){
        TicketOutputDto ticketOutputDto = new TicketOutputDto();
        BeanUtils.copyProperties(ticket, ticketOutputDto);
        ticketOutputDto.setGameOutputDto(this.fromGame(ticket.getGame()));
        return ticketOutputDto;
    }
}
