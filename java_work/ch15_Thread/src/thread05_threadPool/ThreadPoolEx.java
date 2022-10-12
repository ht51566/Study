package thread05_threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
	
	public static void main(String[] args) {
		
//		for(int i =0; i < 10; i++) {
//			MyThread mt = new MyThread();
//			mt.start();
//		}
		
//		ExecutorService pool = Executors.newFixedThreadPool(3);
//		ExecutorService pool = Executors.newCachedThreadPool();
		ExecutorService pool = new ThreadPoolExecutor(3, 8, 3L, TimeUnit.SECONDS, new SynchronousQueue<>());
		
		for(int i =0; i < 10; i++) {
			MyThread mt = new MyThread();
			pool.submit(mt);
		}
	}
}
