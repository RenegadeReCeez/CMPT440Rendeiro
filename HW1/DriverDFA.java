/*Ryan Rendeiro
 * CMPT 440
 * 5/12/17
 */
import java.util.Scanner;
public class DriverDFA {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        ManWolf.transition(scan.toString()); // calls the transition method in ManWolf to see if the entered string is accepted as a correct answer
        
    }
}