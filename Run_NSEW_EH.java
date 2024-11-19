package wk09_Exceptions;

import java.util.Scanner;

public class Run_NSEW_EH {

	public static void main(String[] args) {

		
		/*
		Implement 3 classes – Run_NSEW, NSEW3, and NSEW_EH
		In NSEW3 class, define a setDirection method that reads-in a direction and invokes an exception handler class method to indicate a valid direction (N, S, E, W) was entered
		EH method also ensures only N, S, E, or W can be entered, such that the system will not fail if a non-NSEW entry occurs
		*/
		
		
		NSEW3 nsew = new NSEW3();
		
		nsew.setDirection();
		
		

	}

}

class NSEW3 {
	
	String dir = "";
	int retCode = -1;
	
	
	Scanner scan = new Scanner(System.in);
	NSEW_EH eh = new NSEW_EH();
	
	public void setDirection() {
		retCode = -1; 
		System.out.print("Enter a direction, N, S, E, W: ");
		dir = scan.next();
		dir = dir.toUpperCase();
		retCode = eh.ckDir(dir);
		while(retCode != 0) {
			
		}
		System.out.println("Direction: " + dir);

	}
}



class NSEW_EH {
	int errCode = -1;
	public int ckDir(String dir) {
		if(!dir.equals("N") && !dir.equals("S") && !dir.equals("E") && !dir.equals("W")) {
			errCode = 1;
			System.out.println("Direction must be N, S, E, or W");

		}
		else {
			errCode = 0;
		}
		return 1;
	}
	
}
