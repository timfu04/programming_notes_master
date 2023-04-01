
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// multithreading = Process of executing multiple threads simuthaneously 
		//					Helps maximum utilization of CPU
		//					Threads are independent, they don't affect the execution of other threads.
		//					An exception in one thread will not interrupt other threads
		//					Useful for serving multiple clients, multiplayer games, or other mutually independent tasks
		
		// Way 1 to create thread (already inherits Thread class - can only inherit one parent class in Java)
		// Create a subclass of Thread
		MyThread thread1 = new MyThread();
		
		// or
		
		// Way 2 to create thread with Runnable (preferable way because can still inherit a parent class)
		// Implement Runnable interface and pass instance as an argument to Thread
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		// JVM will exit when all user threads are finished
		// Daemon threads run in the background
		// Daemon thread will still run if join is specified
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		
		thread1.start();
		// pause other threads until thread 1 finished
		thread1.join(); // calling thread (ex.main) waits until the specified thread dies for x milliseconds
		
		thread2.start();
		// pause other threads until thread 2 finished
		thread2.join();
		 
		System.out.println("This is from main thread hehe");
		System.out.println(1/0);
	}
}


