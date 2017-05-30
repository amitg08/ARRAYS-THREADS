import java.util.Scanner;

public class binarySearch {
	
	public static void main(String[] args){
		int first, last, middle, n, c, search, array[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = s.nextInt();
        array = new int[n];
        
        System.out.println("Enter " + n + " integers");
        
		for(c = 0; c < n; c++){
		array[c] = s.nextInt();
		}

		System.out.println("Enter the element to be searched");
		search = s.nextInt();

		first = 0;
		last = n-1;
		middle = (first+last)/2;

		while(first <= last){

		if(array[middle] < search){
		first = middle+1;
		}
		
		else if(array[middle] == search){
		System.out.println("element found at location " + (middle + 1) + ".");
		}
		
		else{
		last = middle - 1;
		middle = (first + last)/2;
		}
		}
		
		if(first > last){
			System.out.println(search + " is not present in the list.");
		}
		}

} 
