package com.haidara.gamesandticketsservices.services.Game;

import com.haidara.gamesandticketsservices.dtos.inputDtos.GameInputDto;
import com.haidara.gamesandticketsservices.dtos.outputDtos.GameOutputDto;
import com.haidara.gamesandticketsservices.exceptions.custome.InvalidTicketsNumberException;
import com.haidara.gamesandticketsservices.exceptions.custome.MissingFieldsException;

import java.util.List;

public interface GameServices {
    GameOutputDto createGame(GameInputDto gameInputDto) throws MissingFieldsException, InvalidTicketsNumberException;
    List<GameOutputDto> gamesList();
}
