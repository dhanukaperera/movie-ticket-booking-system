/*
 * Student ID	: IT14031380
 * Student Name : Perera P.D.S
 * Distributed Systems
 * Assignment 2 � Web Services
 * */
package com.it14031380.dsAssignment2.paymentService;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/PaymentService")
public class PaymentService {
	public static Map<Integer, Map<String, Double>> cardInfo = new HashMap<>();

	PaymentService() {
		// Adding some dummy data
		Payment p1 = new Payment();
		p1.setCardNo(123456789);
		p1.setAmount(100000);

		Payment p2 = new Payment();
		p2.setCardNo(123123123);
		p2.setAmount(0);

		Payment p3 = new Payment();
		p3.setCardNo(111222333);
		p3.setAmount(1000);

		Map<String, Double> m1 = new HashMap<String, Double>();
		m1.put("cardNo", (double) p1.getCardNo());
		m1.put("amount", (double) p1.getAmount());

		Map<String, Double> m2 = new HashMap<String, Double>();
		m2.put("cardNo", (double) p2.getCardNo());
		m2.put("amount", (double) p2.getAmount());

		Map<String, Double> m3 = new HashMap<String, Double>();
		m3.put("cardNo", (double) p3.getCardNo());
		m3.put("amount", (double) p3.getAmount());

		cardInfo.put(p1.getCardNo(), m1);
		cardInfo.put(p2.getCardNo(), m2);
		cardInfo.put(p3.getCardNo(), m3);

	}
	// Send card no and amount and check whether the card no is valid
	// and the balance is enough to pay.
	@GET
	@Consumes("text/plain")
	@Produces("application/json")
	@Path("/get/{id}/{amount}")
	public Response makePayment(@PathParam("id") int id,
			@PathParam("amount") double pAmount) {
		if (cardInfo.containsKey(id)) {
			Map<String, Double> info = new HashMap<>();
			info = cardInfo.get(id);
			Payment entity = new Payment();
			entity.setCardNo(id);
			entity.setAmount(info.get("amount"));
			
			ResponceMessage msg = new ResponceMessage();

			double a = entity.getAmount();
			//Checking payment amount and card balance.
			if (a > pAmount) {
				msg.setMessage("Payment Sucessfully");
			} else {
				msg.setMessage("Insufficient Blance");
			}
			return Response.ok(msg).build();
		}

		ResponceMessage msg = new ResponceMessage();
		msg.setMessage("Card is not registered");
		return Response.ok(msg).build();

	}

}