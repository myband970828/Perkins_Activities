import java.util.Scanner;
public class AgeScanner1{
  public static void main(String []args){
  
  Scanner s = new Scanner(System.in);
  int age;
  do{
 
  	System.out.print("Type Your Age: ");
  		age = s.nextInt() ;
  
  	if (age >= 0 && age <= 3){
      	System.out.println("You're a Baby");
      
  	}else if(age >= 4 && age <= 12){
      	System.out.println("You're a Child");
      
  	}else if(age >= 13 && age <= 19){
      		System.out.println("You're a Teenager");
      
  	}else if(age >= 20 && age <= 32){
      	System.out.println("You're a Young Adult");
      
  	}else if(age >= 33 && age <= 45){
      	System.out.println("You're a Middle Age");
  
  	}else if(age >= 46 && age <= 59){
      	System.out.println("You're an Adult");
  
  	}else if(age >= 60 && age <= 122){
      	System.out.println("You're an Senior");
  
  	}else{
  	  	System.out.println("Invalid Age!");
  	 
  	}
  	}while (age < 0 || age > 122);
  }
}