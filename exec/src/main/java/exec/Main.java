package exec;
/*
import java.lang.System;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;   //Imported Concurrent for ExecutionException
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pool.RejectionHandler;
//import sun.net.www.protocol.http.Handler;
 * 
 */

public class Main {

/*	
public static void main(String[] args) throws ExecutionException, InterruptedException {
		
	/*
		//------------------------------------------------
		//Question 1
		System.out.println("Question (1) - MultiThreading"); //For Decoration Purposes
		
		HelloThread T1 = new HelloThread( "T1"); 
	    T1.start();
	    HelloThread T2 = new HelloThread( "T2");
	    T2.start();
	    HelloThread T3 = new HelloThread( "T3");
	    T3.start();
	    
	    //------------------------------------------------
	    Thread.sleep(5000);   //Wait 5 seconds
	    //------------------------------------------------
	    //Question 2
	    System.out.println("Question (2) - ");   //For Decoration Purposes
	    
	    TaskService service = new TaskService();
	    service.getEmployees("s").forEach(System.out::println);    
	    //no need to call shutdown() since it prevents clients to send more work to the executor service hence enforcing synchronous calls
		service.shutdown();
		
			int corePoolSize = 2;
			int maximumPoolSize = 5;
			int keepAliveTime = 10;
			int queueSize = 3;
			
			ThreadFactory threadFactory = Executors.defaultThreadFactory();
			ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,keepAliveTime, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueSize), threadFactory,new RejectionHandler());
	    }
	   */ 

}
