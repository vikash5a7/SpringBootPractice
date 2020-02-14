package com.bridgelabz.ticketbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.ticketbooking.dao.TicketBookingDao;
import com.bridgelabz.ticketbooking.enties.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;

	public void createTicket(Ticket ticket) {
		ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);

	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTickets(Integer ticketId, String newEmail) {

		Ticket ticket = ticketBookingDao.findById(ticketId).get();
		ticket.setEmail(newEmail);
		Ticket saveTicket = ticketBookingDao.save(ticket);
		return saveTicket;
	}

}
