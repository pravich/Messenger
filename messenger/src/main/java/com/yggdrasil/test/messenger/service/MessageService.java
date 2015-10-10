package com.yggdrasil.test.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.yggdrasil.test.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World!", "Wiz");
		Message m2 = new Message(1L, "Hello Jersey!", "Wiz");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
