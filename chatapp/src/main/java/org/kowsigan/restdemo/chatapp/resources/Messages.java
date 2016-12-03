package org.kowsigan.restdemo.chatapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kowsigan.restdemo.chatapp.model.Message;
import org.kowsigan.restdemo.chatapp.service.MessageService;

@Path("/messages")
public class Messages {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage()
	{
		
		
		return new MessageService().getMessage();
	}
	
	
}
