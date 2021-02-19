package pool;

public class WorkerThread implements Runnable{

	private Integer count;
	
	public WorkerThread(Integer count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ "start : " + count);
		try {
			
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ "end : " + count);
		
	}
	
	@Override
	public String toString() {
		return count.toString();
	}

}
