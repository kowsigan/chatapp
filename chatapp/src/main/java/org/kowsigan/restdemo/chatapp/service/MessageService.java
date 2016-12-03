package org.kowsigan.restdemo.chatapp.service;

import java.util.ArrayList;
import java.util.List;

import org.kowsigan.restdemo.chatapp.model.Message;

public class MessageService {

	
	public List<Message> getMessage()
	{
	
	Message m1 = new Message(1l,"hello","kowsigan");
	
	Message m2 = new Message(2l,"hello2","kowsigan");
	
	List<Message> l= new ArrayList<Message>();
	
	l.add(m1);
	
	l.add(m2);
	
	return l;
	
	}
	
}
