import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class ShapesArea{
	public static void main(String []args){
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner s = new Scanner(System.in);
		char input;
		double area, base, width, height, side, radius;
		char loop;
		do{
		System.out.print("Choose what shape you want to compute for the Area." + "\n\n\t T for Triangle."
																			   + "\n\t R for Rectangle."
																			   + "\n\t S for Square."
																			   + "\n\t C for Cricle." 
																			   + "\n\n Enter the Letter: ");	
		input = s.next().charAt(0);
		switch(input){
		       case 'T':
		       case 't':
			         System.out.print("Enter the Height: ");
			         height = s.nextDouble();
			         System.out.print("Enter the Base: ");
			         base = s.nextDouble();
			         area = (0.5) * base *height;
			         System.out.println("The Area of the Triangle is " + df.format(area));
			           break;	
		       case 'R':
		       case 'r':
			         System.out.print("Enter the Height: ");
			         height = s.nextDouble();
			         System.out.print("Enter the Base: ");
			         base = s.nextDouble();
			         area = height * base;
			         System.out.println("The Area of the Rectangle is " + df.format(area));
			           break;	
		       case 'S':
		       case 's':
			         System.out.print("Enter the Value of the Side: ");
			         side = s.nextDouble();
			         area = side * side * side * side;
			         System.out.println("The Area of the Square is " + df.format(area));
			           break;
		       case 'C':
		       case 'c':
			         System.out.print("Enter the Radius: ");
			         radius = s.nextDouble();
			         area = Math.PI * (radius * radius);
			         System.out.println("The Area of the Circle is " + df.format(area));
			           break;
		       default:
			         System.out.println("Error!");
		  		}
	 	 System.out.print("Try again?	(Y/N) >>> ");
		 loop = s.next().charAt(0);
		}while (loop == 'Y' || loop == 'y');
	
	}
}