package org.kowsigan.restdemo.chatapp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kowsigan.restdemo.chatapp.database.DatabaseModel;
import org.kowsigan.restdemo.chatapp.model.Message;
import org.kowsigan.restdemo.chatapp.service.MessageService;

@Path("/messages")
public class Messages {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage()
	{
		
		
		return new MessageService().getAllMessages();
	}
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("id")long id)
	{
		
		return new MessageService().getMessage(id);
		
		
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addMessage(Message m1)
	{
		//return "post works";
		
		//return new MessageService().addMessage(m1);
		
		new MessageService().addMessage(m1);
		
		return  "" +DatabaseModel.messageData.size();
		
		
		
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	@Consumes(MediaType.APPLICATION_JSON)	
	public Message removeMessage(@PathParam("id")long id,Message m1)
	{
		
		return new MessageService().updateMessage(id, m1);
	}
	
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Message removeMessage(@PathParam("id")long id)
	{
		
		return new MessageService().removeMessage(id);
	}
	
	
}
