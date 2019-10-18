//HEADER
//Chapter 2 Exercise 3
//Robert Brinker IV
//CS160 Fall 2019
//10/17/2019
////Exercise 3 - Learn how to use arithmetic operators, and compound entities(using multiple values).

package Pack;

public class code {

	public static void main(String[] args) {
		int hour = 22;
		int minute = 30;
		int second = 27;
		int secondsinday = ((24 * 60) *60);
		int totalseconds = ((hour * 60 + minute) * 60 + second );
		int secondsofstarttime = ((22 * 60 + 4) * 60 + 17 );
		
		System.out.print("It has been ");
		System.out.print((hour * 60 + minute) * 60 + second );
		System.out.print(" seconds since midnight. ");
		
		System.out.print("There is currently ");
		System.out.print(secondsinday - totalseconds );
		System.out.print(" seconds remaining until midnight. ");
		
		System.out.print(totalseconds * 100 / secondsinday);
		System.out.print(" percent of the day has gone by.");
		
		System.out.print(" There has been ");
		System.out.print(totalseconds - secondsofstarttime );
		System.out.print(" seconds since I started this project.");
	}
		
}
