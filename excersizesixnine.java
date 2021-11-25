import java.util.*;// import for scanner
import java.io.*;// for file
public class excersizesixnine {
	public static void main (String[] args) throws FileNotFoundException{
		wordWrap(new Scanner(new File("exsixnine.txt")));//calls method with file
	}
	

	public static void wordWrap(Scanner input) {
			while(input.hasNextLine()) {
				String s = input.nextLine();//evaluates each line
			int end = 60;//start and end values
			int start = 0;
				while(s.length() > 60) {//when our string characters are greater than 60 then 
					System.out.println(s.substring(start, end));//prints our string with an end
					s = s.substring(60);//makes sure that it doesn't repeat over and over
			}
			
			System.out.println(s);//prints outcome
		}
	}
}

