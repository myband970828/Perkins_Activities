import javax.swing.JOptionPane;
public class AgeScanner3{
	public static void main(String[] args){
		int age =0;
		do{
			
			age = Integer.parseInt(JOptionPane.showInputDialog("Type Your Age: "));
		if (age >= 0 && age <= 3){
      		JOptionPane.showMessageDialog(null,"You're a Baby");
      
  		}else if(age >= 4 && age <= 12){
      		JOptionPane.showMessageDialog(null,"You're a Child");
      
  		}else if(age >= 13 && age <= 19){
      		JOptionPane.showMessageDialog(null,"You're a Teenager");
      
  		}else if(age >= 20 && age <= 32){
      		JOptionPane.showMessageDialog(null,"You're a Young Adult");
      
  		}else if(age >= 33 && age <= 45){
      		JOptionPane.showMessageDialog(null,"You're a Middle Age");
  
  		}else if(age >= 46 && age <= 59){
      		JOptionPane.showMessageDialog(null,"You're an Adult");
  
  		}else if(age >= 60 && age <= 122){
      		JOptionPane.showMessageDialog(null,"You're an Senior");
  
  		}else{
  	  		JOptionPane.showMessageDialog(null,"Invalid Age!");
  	  	
  	
  	
  		}
  		}while (age < 0 || age > 122);
  	}
}