import java.util.Scanner;

public class letsgo {
	
class Month {
		
		String void printMonth(int month) {
			
			String str = "";
			
			switch(month) {
			case 0: str = "January";
			break;
			switch(month) {
			case 1: str = "February";
			break;switch(month) {
			case 2: str = "March";
			break;switch(month) {
			case 4: str = "April";
			break;switch(month) {
			case 5: str = "May";
			break;switch(month) {
			case 6: str = "June";
			break;switch(month) {
			case 7: str = "July";
			break;switch(month) {
			case 8: str = "August";
			break;switch(month) {
			case 9: str = "September";
			break;switch(month) {
			case 10: str = "October";
			break;switch(month) {
			case 11: str = "November";
			break;
			case 12: str = "December";
			break;
			default:
				str = "Invalid Month";
		
					}
			
					
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month obj = new Month();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month number: ");
		int month = scan.nextInt();
		
		
		obj.printMonth(0);
		
		
		
		
		
		
		
	}

}
