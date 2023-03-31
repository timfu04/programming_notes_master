import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//				for future execution in a background thread
		// 				(keeps track time in a background thread)
		
		// TimerTask = 	A task that can be scheduled for one-time 
		//				or repeated execution by a Timer
		//              (task to be scheduled)
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("HAPPY NEW YEAR!");
					timer.cancel(); // cancel timer task
				}
			}		
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2023);
		date.set(Calendar.MONTH,Calendar.DECEMBER);
		date.set(Calendar.DAY_OF_MONTH,31);
		date.set(Calendar.HOUR_OF_DAY,23);
		date.set(Calendar.MINUTE,59);
		date.set(Calendar.SECOND,50);
		date.set(Calendar.MILLISECOND,0);
		
		//timer.schedule(task, 0); // start task immediately (0 milliseconds)
		//timer.schedule(task, date.getTime()); // start task on specific time
		timer.scheduleAtFixedRate(task, 0, 1000); // start task immediately and repeat every 1 second
		// start task on a specific time and repeat every 1 second (start on 31/12/2023 11:59:50:0 and repeat every 1 second)
		//		timer.scheduleAtFixedRate(task, date.getTime(), 1000); 
	}
}


