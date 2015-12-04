package com.datastax.fixmessage;

import java.util.concurrent.BlockingQueue;

import com.datastax.fixmessage.model.FixUpdate;
import com.datastax.session.dao.FixMessageDao;

public class FixMessageUpdater implements Runnable{

	private BlockingQueue<FixUpdate> updateQueue;
	private FixMessageDao dao;


	public FixMessageUpdater(FixMessageDao dao, BlockingQueue<FixUpdate> updateQueue){
		this.dao =dao;
		this.updateQueue = updateQueue;
	}
	
	
	@Override
	public void run() {

		while (true){
			
			FixUpdate update;
			try {
				update = this.updateQueue.take();
				
				if (update!=null){
					dao.updateField(update.getField(), update.getValue(), update.getId());
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
