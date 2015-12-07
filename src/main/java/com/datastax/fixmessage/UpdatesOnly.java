package com.datastax.fixmessage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.demo.utils.PropertyHelper;
import com.datastax.demo.utils.Timer;
import com.datastax.fixmessage.model.FixMessage;
import com.datastax.fixmessage.model.FixUpdate;
import com.datastax.session.dao.FixMessageDao;

public class UpdatesOnly {

	private static Logger logger = LoggerFactory.getLogger(UpdatesOnly.class);
	private AtomicInteger sequence = new AtomicInteger(0);
	public UpdatesOnly() {

		String contactPointsStr = PropertyHelper.getProperty("contactPoints", "localhost");
		int noOfMessages = Integer.parseInt(PropertyHelper.getProperty("noOfMessages", "100000"));
		int noOfThreads = Integer.parseInt(PropertyHelper.getProperty("noOfThreads", "4"));		
		
		BlockingQueue<FixUpdate> updateQueue = new ArrayBlockingQueue<FixUpdate>(1000);
		
		ExecutorService updateExecutor = Executors.newFixedThreadPool(noOfThreads);
		final FixMessageDao dao = new FixMessageDao(contactPointsStr.split(","));		

		for (int i = 0; i < noOfThreads; i++) {
			updateExecutor.execute(new FixMessageUpdater(dao, updateQueue));
		}

		Timer timer = new Timer();
		for (int i = 0; i < noOfMessages * 4; i++){
			
			int randomId = new Double((Math.random()*noOfMessages) + 1).intValue();
			
			try {
				updateQueue.put(new FixUpdate("qty", new Integer(new Double(Math.random()*100).intValue()), randomId));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i % 10000 == 0){
				logger.info("Updated " + i + " messages");
			}
		}
		
		timer.end();
		logger.info(timer.getTimeTakenSeconds() + "sec to update " + noOfMessages*100 + " messages (" + (noOfMessages*4/timer.getTimeTakenSeconds()) +" a sec)");
		
		
	}

	private FixMessage getSequenceMessage() {
		
		FixMessage message = new FixMessage();
		message.setId(sequence.incrementAndGet());
		
		return message;
	}


	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new UpdatesOnly();

		System.exit(0);
	}
}
