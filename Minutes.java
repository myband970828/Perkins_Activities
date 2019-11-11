import java.util.Scanner;
public class Minutes{
  public static void main(String[] args) {
  	Scanner x = new Scanner(System.in);
  	int minutes, hours, min;
  	char loop;
  	do{
  	
  	   System.out.println("Enter how many minute/s: ");
  	   minutes = x.nextInt() ;
  	   hours = minutes / 60;
       min = minutes % 60;
       System.out.println("There are " + hours + " hour/s and " + min + " minute/s.");
       
    	System.out.print("Try again?	(Y/N) >>> ");
		loop = x.next().charAt(0);
	}while (loop == 'Y' || loop == 'y');
  }
}