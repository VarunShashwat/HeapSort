
import java .util.*;
public class Hashmap2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of th array");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enetr the array");
		for(int i=0;i<n;i++){
		    arr[i]= sc.nextInt();
		    
		}
		TreeMap<Integer,Integer> tm= new TreeMap<>();
		for(int i=0;i<n;i++){
		    tm.put(arr[i],1);
		    
		}
		System.out.println("the largest element is "+tm.lastEntry().getKey());
		
		
	}
}