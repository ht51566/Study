package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	String com;
	String to;
	
	public Message(String com, String to) {
		this.com=com; this.to=to;
	}

	@Override
	public String toString() {
		return "Message [com=" + com + ", to=" + to + "]";
	}
}


public class QueueTest {
	public static void main(String[] args) {
		//Queue: 선입선출 - FIFO
		Queue<Message> mq = new LinkedList<>();
		
		mq.offer(new Message("sendMail", "tom"));
		mq.offer(new Message("sendSMS", "jane"));
		mq.offer(new Message("sendVoiceMail", "sam"));
		
		System.out.println(mq);
		
		while(!mq.isEmpty()) {
			Message msg = mq.poll();
			System.out.println(msg);
		}
	}
}
