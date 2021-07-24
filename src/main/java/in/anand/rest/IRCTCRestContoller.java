package in.anand.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.anand.request.PassengerRequest;
import in.anand.response.TicketResponse;

@RestController
public class IRCTCRestContoller {
	@PostMapping(value="/bookTicket",consumes={"application/xml","application/json"},produces= {"application/json","application/xml"})
	public TicketResponse bookTicket(@RequestBody PassengerRequest request)
	{
	
		//logic for ticket booking
		TicketResponse response = new TicketResponse();
		response.setStatus("Confirmed");
		response.setPrice(550.25);
		BeanUtils.copyProperties(request, response);
		return response;
	}
}
