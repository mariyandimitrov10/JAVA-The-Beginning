package util;

public class Helper {

	public static boolean isNumeric(String s) {
		//Empty or null string? 
				if(s == null || s.isBlank()) return false;
				 
				//Check if digit is not a number
				for(int i = 0; i < s.length(); i++) {
					if(!Character.isDigit(s.charAt(i))) {
						return false;
					}
				}
				//String is not null, not empty, no white space and only digits
				return true;

	}

}
