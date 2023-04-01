
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority
    			
    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died
    					
    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”
    						
    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
					JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */
		
		System.out.println("Current active thread count: " + Thread.activeCount()); // number of thread currently active
		
		System.out.println();
		
		System.out.println("Main thread name: " + Thread.currentThread().getName()); // get current thread name
//		Thread.currentThread().setName("MAINNNNNN"); // set current thread name
		System.out.println("Main thread name: " + Thread.currentThread().getName());
		
		System.out.println();
		
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority()); // 1- 10 (the higher the number, the higher the priority
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		
		System.out.println();
		
		System.out.println("Is main thread alive? " + Thread.currentThread().isAlive());
		
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("You are done!");
		
		System.out.println();
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.start();

		System.out.println("Is thread2 daemon thread? " + thread2.isDaemon());
		System.out.println("Is thread2 alive? " + thread2.isAlive()); // need to start it to be alive(true), not alive(false) by default
		System.out.println("thread2 name: " + thread2.getName());
		thread2.setName("2nd thread");
		System.out.println("thread2 name: " + thread2.getName());
		
		// Inherits priority (priorty set to 10 in Thread, so this sub class has priority of 10 too)
		System.out.println("thread2 priority: " + thread2.getPriority());
		thread2.setPriority(1);
		System.out.println("thread2 priority: " + thread2.getPriority());
		
		System.out.println("Current active thread count: " + Thread.activeCount()); // two active threads (Thread & thread2)
		
		Thread.sleep(3000);
	}
}


