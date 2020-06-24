package basics;

import java.io.*;

public class Password {

	public static void main(String[] args) { 
		String filename = "E:\\Jinal's project\\Udemy\\Java\\PwdList.txt";
		File file = new File(filename);
		boolean c1=false, c2=false, c3=false;
		String pass[] = new String[13];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0;i<pass.length;i++) {
				pass[i] = br.readLine();
			}
			 
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}catch(IOException e) {
			System.out.println("Invalid Input!");
		}
		for(int i=0;i<pass.length;i++) {
			try {
				
				//System.out.println(pass[i]);
				for(int j=0;j<pass[i].length();j++) {
					if(Character.isDigit(pass[i].charAt(j))) {
						c1 = true;
					}else if(Character.isLetter(pass[i].charAt(j))) {
						c2 = true;
					}else if((pass[i].charAt(j)) == '!' || (pass[i].charAt(j)) == '@' || (pass[i].charAt(j)) == '#') {
						c3 = true;
					}
				}
				if(c1 != true) {
					throw new NumberNotFoundException(pass[i]);
				}
				if(c2 != true) {
					throw new LetterNotFoundException(pass[i]);
				}
				if(c3 != true) {
					throw new SymbolNotFoundException(pass[i]);
				}
			
		}catch (NumberNotFoundException e) {
			System.out.println("Number not found!");
			System.out.println(e.toString());
		}catch (LetterNotFoundException e) {
			System.out.println("Letter not found!");
			System.out.println(e.toString());
		}catch (SymbolNotFoundException e) {
			System.out.println("Symbol not found!");
			System.out.println(e.toString());
		}
	}			
	}

}

class NumberNotFoundException extends Exception{
	String str;
	NumberNotFoundException(String s){
		str = s;
	}
	public String toString() {
		return ("Invalid Password :" + str);
	}
}

class LetterNotFoundException extends Exception{
	String str;
	LetterNotFoundException(String s){
		str = s;
	}
	public String toString() {
		return ("Invalid Password :" + str);
	}
}

class SymbolNotFoundException extends Exception{
	String str;
	SymbolNotFoundException(String s){
		str = s;
	}
	public String toString() {
		return ("Invalid Password :" + str);
	}
}

/*
 * Read a file that contains multiple sets of passwords (use http://www.theonegenerator.com/
to generate a set of test data).
 Verify that the password contains all of the following criteria:
1. A number
2. A letter
3. Special character (! @ #)
 Create three User Defined Exceptions for the corresponding criteria.
 If the password does not meet the criteria, create and throw the appropriate exception
*/
