public class VariablesAndDataTypes{
  public static void main(String []args){
  
    String temp = "The temperature in Baguio City has warmed throughout the years.";
    float tempD = 16.0f; 
    double tempN = 23.5f;
    char a = 'A';
    int months = 12, weeks = 4, days = 7;
    byte hours = 24;
    boolean weather = true;
    if (weather){
    System.out.print(temp + "\n\t" + a + " recent news article stated that City has been averaging " + tempD +
                      " degrees  celcius at dawn and " + tempN + 
                      " at noon. \n\t\tRegardless, lowlanders still feel cold " +
                       hours + " hours a day, " + days + " days a week " + weeks + " per month and " + 
                       months + " months each year.\n");
    }else{
    System.out.println("The boolean was changed to a False value.");
    }
  }
}