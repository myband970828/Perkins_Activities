import javax.swing.JOptionPane;
public class Time{
    public static void main (String[] args) {
      int minutes, hours, min;
      
      minutes = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how long did you work in minutes: "));
      hours = minutes / 60;
      min = minutes % 60;
      JOptionPane.showMessageDialog(null,hours + " hours and " + min  + " minutes.");
      }
 }  