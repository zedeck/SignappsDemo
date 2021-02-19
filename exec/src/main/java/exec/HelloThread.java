package exec;

public class HelloThread implements Runnable {
	
	private Thread t;
	private String threadName;

	//Thread Creation 
	public HelloThread(String name) {
		threadName = name;
		//System.out.println("Created thread :" + threadName);
	}
	
	@Override
	public void run() {
		try {
				if(threadName == "T2")
					Thread.sleep(3000);   //Wait 3 seconds
				System.out.print("hello " + threadName + " ");	
			}
			catch (InterruptedException e) {
				System.out.println("Thread " +  threadName + " was interrupted.");
			}
		}
	//-------------------
	public void start() {
		if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	}
}
