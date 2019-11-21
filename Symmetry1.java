import java.util.Scanner;
public class Symmetry1 {
    public static void main(String args[]){
    	char loop;
        do{
            System.out.print("Enter the number of rows and columns: ");
            Scanner p = new Scanner (System.in);
            int kins = p.nextInt();
            int matrix[][] = new int[kins][kins];
            for(int i = 0; i <kins; i++){
                for(int j = 0; j <kins; j++){
                    System.out.print("Enter the elements " + ("("+ i +")") + ("(" + j +")") + ":" +" " );
                    matrix [i][j] = p.nextInt();
                }
            
                System.out.println();
            }
            
            for(int i = 0; i <kins; i++){
                for(int j = 0; j <kins; j++){
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            boolean symmetric = true;
		
            for(int i = 0; i <kins; i++){
                for(int j = 0; j <kins; j++){
                    if(matrix [i][j] != matrix [j][i]){
                        symmetric = false;
                        break;
                    }
                }
            }
            if(symmetric){
                System.out.println("Yes");
            }else
                System.out.println("No");
            
            System.out.print("Do you want to try again? [Y/N]");
            loop = p.next().charAt(0);
        }while (loop == 'y' || loop == 'Y');
    }
}