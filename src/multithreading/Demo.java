package multithreading;


public class Demo {

	private int counter1;
	private int counter2;
	
	public void incrementCounter1(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			counter1++;
		}
		
	}
	
	public void incrementCounter2(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			counter2++;
		}
		
	}
	
	public void increment(){
		
		for(int i=0; i<1000; i++){
			incrementCounter1();
			incrementCounter2();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting the process");
		long startTime = System.currentTimeMillis();
		Demo demo = new Demo();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				demo.increment();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				demo.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Final value of counter 1: "+demo.counter1);
		System.out.println("Final value of counter 2: "+demo.counter2);
		
		long totalTime = System.currentTimeMillis()-startTime;
		System.out.println("Overall time: " + totalTime);
	}

}
