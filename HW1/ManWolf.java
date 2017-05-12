/*Ryan Rendeiro
 * CMPT 440
 * 5/12/17
 */
public class ManWolf {
	private static final int q0 = 0;
	private static final int q1 = 1;
	private static final int q2 = 2;
	private static final int q3 = 3;
	private static final int q4 = 4;
	private static final int q5 = 5;
	private static final int q6 = 6;
	private static final int q7 = 7;
	private static final int q8 = 8;
	private static final int q9 = 9;
	private static final int q10 = 10;
	
	static private int[][] deltaG = {{q0,q1},{q1,q0},{q2,q10},{q3,q4},{q4,q3},{q5,q6},{q6,q5},{q7,q10},{q8,q9},{q9,q8},{q10,q10}}; // all the state transitions when input is g
	static private int[][] deltaW = {{q0,q10},{q1,q10},{q2,q3},{q3,q2},{q4,q10},{q5,q10},{q6,q7},{q7,q6},{q8,q10},{q9,q10},{q10,q10}}; // all the state transitions when input is w
	static private int[][] deltaC = {{q0,q10},{q1,q10},{q2,q5},{q3,q10},{q4,q7},{q5,q2},{q6,q10},{q7,q4},{q8,q10},{q9,q10},{q10,q10}}; // all the state transitions when input is c
	static private int[][] deltaN = {{q0,q10},{q1,q2},{q2,q1},{q3,q10},{q4,q10},{q5,q10},{q6,q10},{q7,q8},{q8,q7},{q9,q10},{q10,q10}}; // all the state transitions when input is n
	
	public static void main(String[] args){
	String input = args.toString(); // takes the input and converts it to a string so it can be used by the transition method
	transition(input); 
	
	}
	private static int state;
	public static void transition(String in){
		for (int i = 0; i < in.length(); i++){ // goes through the input and acts on each element of the string
			char a = in.charAt(i);
			if (a == 'g'){
				try {
					System.out.print(state + " to ");
					state = deltaG[state][1];
					System.out.print(state + ",");
				}
				catch(ArrayIndexOutOfBoundsException ex) {
					state = q0;
				}
			}else if(a == 'w'){
				try {
					System.out.print(state + " to ");
					state = deltaW[state][1];
					System.out.print(state + ",");
				}
				catch(ArrayIndexOutOfBoundsException ex) {
					state = q0;
				}
			}else if (a == 'c'){
				try {
					System.out.print(state + " to ");
					state = deltaC[state][1];
					System.out.print(state + ",");
				}
				catch(ArrayIndexOutOfBoundsException ex) {
					state = q0;
				}
			}else if (a == 'n'){
				try {
					System.out.print(state + " to ");
					state = deltaN[state][1];
					System.out.print(state + ",");
				}
				catch(ArrayIndexOutOfBoundsException ex) {
					state = q0;
				}
			}
		}
		if (state == 9) {
			System.out.print("That is a valid solution");
		}else if (state != 9){
			System.out.print("That is not a valid solution");
		}
	}
	
}
