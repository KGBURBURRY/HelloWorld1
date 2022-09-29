package com.bptn.course;

class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int battery = 30;
		String message = "";

	     if (battery < 50)
	     {
	         message = "Plug in your phone!";
	     }
	     else if (battery == 100)
	     {
	         message = "Unplug your phone!";
	     }
	 
	     else
	     {
	       message = "All is okay!";
	     }

	     System.out.println(message);

	}

}
