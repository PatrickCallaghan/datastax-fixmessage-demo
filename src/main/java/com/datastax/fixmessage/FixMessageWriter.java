package com.datastax.fixmessage;

import java.util.concurrent.BlockingQueue;

import com.datastax.fixmessage.model.FixMessage;
import com.datastax.session.dao.FixMessageDao;

public class FixMessageWriter implements Runnable{

	private BlockingQueue<FixMessage> insertQueue;
	private FixMessageDao dao;


	public FixMessageWriter(FixMessageDao dao, BlockingQueue<FixMessage> insertQueue){
		this.dao =dao;
		this.insertQueue = insertQueue;
	}
	
	
	@Override
	public void run() {

		while (true){
			
			FixMessage message;
			try {
				message = this.insertQueue.take();
				
				if (message!=null){
					dao.saveMessage(message);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
