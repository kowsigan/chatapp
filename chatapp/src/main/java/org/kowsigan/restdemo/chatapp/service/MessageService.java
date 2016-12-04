package org.kowsigan.restdemo.chatapp.service;

import java.util.ArrayList;
import java.util.List;

import static org.kowsigan.restdemo.chatapp.database.DatabaseModel.messageData;
import org.kowsigan.restdemo.chatapp.model.Message;

public class MessageService {

	
	
	

	public List<Message>getAllMessages()
	{
		
		messageData.put(1l, new Message(1l,"hello","kow"));
				
		return new ArrayList(messageData.values());
		
		
	}
	
	
	
	
	public Message getMessage(long id)
	{
	
          
	return messageData.get(id);
	
	}
	
	public Message removeMessage(long id)
	{
		
		return messageData.remove(id);
		
	}
	
	public Message addMessage(long id, Message m1)
	{
		return messageData.put(id, m1);
	}
	
	
}
