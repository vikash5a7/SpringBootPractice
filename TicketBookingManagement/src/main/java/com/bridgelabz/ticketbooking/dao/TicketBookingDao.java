package com.bridgelabz.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.ticketbooking.enties.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
	

}
