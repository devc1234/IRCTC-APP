package com.example.demo.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;
import com.example.demo.repo.PassangerRepository;

@Service
public class PassangerServiceImpl implements PassangerServiceI {

	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger save = passangerRepository.save(psg);

		if (save != null) {
			Ticket t = new Ticket();
			t.settPnr("867875");
			t.setTicketStatus("BOOKED");
			t.setTprice(789.00);
			return t;
		} else {

			return null;
		}
	}
}
