package pool;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int corePoolSize = 2;
		int maximumPoolSize = 5;
		int keepAliveTime = 10;
		int queueSize = 3;
		
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,keepAliveTime, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueSize), threadFactory,new RejectionHandler());

		Monitor monitor = new Monitor(5, poolExecutor);
		Thread thread = new Thread(monitor);
		thread.start();
		
		
		for (int i = 0; i < 10 ; i++) {
			poolExecutor.execute(new WorkerThread(i));
		}
		
		Thread.sleep(2000);
		poolExecutor.shutdown();
		Thread.sleep(4000);
		monitor.shutdown();
	}

}
