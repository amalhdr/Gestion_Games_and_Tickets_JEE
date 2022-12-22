package com.haidara.gamesandticketsservices.repositories;

import com.haidara.gamesandticketsservices.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
