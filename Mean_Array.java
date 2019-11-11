import java.util.Scanner;
public class Mean_Array{
	
  public static void main (String args[]){
 	int size;
  	int elements = 0;
  	int sum = 0;
  	Scanner p = new Scanner(System.in);
  	System.out.print("Enter size of an array: ");
  	size = p.nextInt();
  	int[]a = new int[size];
  	
  	for(int i = 0; i<a.length; i++){
  		System.out.print("Enter the element ["+ i +"] :");
  		elements = p.nextInt();
  		a[i] = elements;
  		sum+=a[i];
  	}
 	 System.out.print("Unsorted Array: ");
  	 for(int i = 0; i<a.length; i++){
  	 	System.out.print(a[i] + " ");
  	 }
  	 for(int i=0; i<a.length; i++){
  	 	for(int j=0; j<a.length; j++){
  	 		if(a[i]<a[j]){
  	 			int temp = a[j];
  	 			a[j] = a[i];
  	 			a[j] = temp;
  	 		}
  	 	}
  	 }
  	 System.out.print("\n" + "Sorted Array: ");
  	 for(int i = 0; i<a.length; i++){
  	 System.out.print(a[i] + "\t");
  	 }
  	 double mean = (sum/a.length);
  	 System.out.print("\n" + "Mean: " + mean);
  	 }
 }