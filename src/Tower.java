import java.util.Scanner;

// Programmer: Quinn Murphy
// Date: 11/10/22
// Class: CS 145
// Assignment: Towers of Hanoi
// References: StackOverflow, book, YouTube
// So this program is pretty simple, and I think it meets
// the criteria. It basically just uses one method
// moveDisc(); to easily solve the problem. 


public class Tower {

	public static void main(String[] args) {
		int numOfDiscs;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to towers of hanoi!");
		System.out.println("How many discs do you want to play with?");
		numOfDiscs = scan.nextInt();
		// user choice represents number of Discs
		moveDisc(numOfDiscs, "A", "B", "C");

	}
	
	//moveDisc will be most of the program. If the number of discs
	// is down to one, simply move the "A" n-discs to the "C" n-discs
	// peg. If there is more then one disc, subtract one disc (numOfDiscs-1)
	// and then move the "C" n-discs to the "B" n-discs. It then prints the 
	// move, and then moves the discs to the order of "B", "A", "C". It basically
	// just goes through all the possibilities.
	
	public static void moveDisc(int numOfDiscs, String start, String temp, String end) {
		if(numOfDiscs==1) { // moving first disk from start to end
			System.out.println("Move " + start + " to " + end);
		}
		else {
			moveDisc(numOfDiscs-1, start, end, temp); // function call
			System.out.println("Move " + start + " to " + end);
			// start becomes temp to represent switch
			moveDisc(numOfDiscs-1, temp, start, end); 
			
		}
	}

}
