package org.kowsigan.restdemo.chatapp.service;

import java.util.ArrayList;
import java.util.List;

import static org.kowsigan.restdemo.chatapp.database.DatabaseModel.messageData;
import org.kowsigan.restdemo.chatapp.model.Message;

public class MessageService {

	
	
	

	public List<Message>getAllMessages()
	{
		
	
				
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
	
	public Message addMessage( Message m1)
	{
		//(messageData.size())+1l
		
		return messageData.put((messageData.size())+1l, m1);
	}
	
	public Message updateMessage(long id, Message m1)
	{
		return messageData.put(id, m1);
	}
	
	
}
