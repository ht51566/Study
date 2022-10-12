package thread06_future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {
	public static void main(String[] args) {
		System.out.println("CPU 개수: " + Runtime.getRuntime().availableProcessors());
		ExecutorService pool = Executors.
				newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("작업 처리 요청");
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("처리결과: " + sum);
			}
		};
		
		Future<?> future = pool.submit(task);
		System.out.println(future);
		
		
		try {
			//작업처리 결과를 리턴: 
			Object fg = future.get();
			System.out.println(fg);
			System.out.println("작업 처리 완료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cpu 부하를 덜어주기 위해 pool 제거
		pool.shutdown();
	}
}
