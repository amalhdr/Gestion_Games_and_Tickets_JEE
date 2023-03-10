package com.haidara.gamesandticketsservices.dtos.outputDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameOutputDto {
    private String id;
    private String ref;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date dateAndTime;
    private String stadium;
    private String team1;
    private String team2;
}
