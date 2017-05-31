//Simple timer that periodically printa a timeout message.
import java.util.Timer;
import java.util.TimerTask;

public class timer {
	
	public static void main(String[] argv) throws Exception {
	    int delay = 5000; // delay for 5 sec.
	    int period = 1000; // repeat every sec.
	    Timer timer = new Timer();

	    timer.scheduleAtFixedRate(new TimerTask() {
	      public void run() {
	        System.out.println("timeout"); 
	      }
	    }, delay, period);
	  }

}
