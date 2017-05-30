import java.lang.Thread;
import java.util.Scanner;
//using thread class
public class prime extends Thread {
	public void run(){
		//user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		//conditions to verify prime or not
		if(n==2){
		     System.out.println("Prime no");
		     }
		     else if (n%2 != 0){
		     System.out.println("Not a Prime no");
		     }
		     else{
		     System.out.println("Not a Prime no");
		     }
		     }
	
	public static void main(String[] args){
		prime p = new prime();
		p.start();
		}
}

//using runnable interface
public class prime implements Runnable{
	public void run(){
		//user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		//conditions to verify prime or not
		if(n==2){
			System.out.println("Prime no");
			}
			else if (n%2 != 0){
			System.out.println("Not a Prime no");
			}
			else{
			System.out.println("Not a Prime no");
			}
			}
	public static void main(String[] args){
		prime p1 = new prime();
		Thread t  = new Thread(p1);
		t.start();
		}
}
		


		
