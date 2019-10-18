//HEADER
//Chapter 2 Exercise 2
//Robert Brinker IV
//CS160 Fall 2019
//10/17/2019
//Exercise 2 - Develop a program to display values such as int and String using string concatenations, as well as gradually adding a few statements.


package Pack;

public class Pack {

	public static void main(String[] args) {
		String day = "Thursday";
		String date = "17";
		String month = "October";
		String year = "2019";
		
		System.out.print("NA Format");
		System.out.println("\n" + day + ", " + month + " " + date + ", " +year);
		System.out.print("EU Format");
		System.out.println("\n" + day + " " + date + " " + month + " " +year);

	}

}
