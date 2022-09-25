import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Scanner;

public class Timer {
	public static Scanner input = new Scanner(System.in);
	public static int choose=1;
	public static int score=10;
	public static double total=0;
    public static void main(String[] args) {
    	timecount();


    	
    }

	public static void timecount() {
		 final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	        final Runnable runnable = new Runnable() {
	            int countdownStarter = 15;

	            public void run() {

	                System.out.print("."+countdownStarter);
	                countdownStarter--;

	                if (countdownStarter < 0) {
	                    System.out.println("--Timer Up!");
	                    scheduler.shutdown();
	                    
	                    
	                }
	            }

	        };
	        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	    }
	}