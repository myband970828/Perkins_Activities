public class CC2_Lab3{
  public static void main(String []args){
  char k = 'K', i = 'I', n = 'N', s = 'S', x = '!';
  int K = k, I = i, N = n, S = s, X = x;
  System.out.println("K - " + K +
                    "\nI - " + I +
                    "\nN - " + N +
                    "\nS - " + S +
                    "\n! - " + X + "\n" +
                    k+i+n+s+x);
   int sum, ave, rem, prod;
   sum = K+I+N+S+X;
   prod = K*I*N*S*X;
   ave = sum/4;
   rem = prod%ave;
   System.out.println("Sum: " + sum +
                      "\nProduct: " + prod +
                      "\nAverage: " + ave +
                      "\nRemainder: " + rem);
  }
}
                   
                    
  
  