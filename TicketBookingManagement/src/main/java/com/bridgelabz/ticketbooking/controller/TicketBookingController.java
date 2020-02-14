package com.bridgelabz.ticketbooking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.ticketbooking.enties.Ticket;
import com.bridgelabz.ticketbooking.service.TicketBookingService;

@RestController
@RequestMapping(value = "api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/createt")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		ticketBookingService.createTicket(ticket);
		return ticket;
	}

	@GetMapping(value = "/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}

	@GetMapping(value = "/alltickets")
	public Iterable<Ticket> getAllTickets() {
		return ticketBookingService.getAllBookedTickets();
	}
	@DeleteMapping(value = "/delete/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		ticketBookingService.deleteTicketById(ticketId);
	}
	@PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
	public Ticket UpdateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail) {
		return ticketBookingService.updateTickets(ticketId,newEmail);
		
	}

}
