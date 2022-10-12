package thread06_future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultEx {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("CPU 개수: " + Runtime.getRuntime().availableProcessors());
		ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("작업 처리 요청");

		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		Future<Integer> future = pool.submit(task);
		System.out.println(future);
		
		int sum = future.get();
		System.out.println("처리결과: " + sum);
		
		pool.shutdown();
		
	}
}
