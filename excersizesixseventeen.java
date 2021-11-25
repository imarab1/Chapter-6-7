import java.util.*;//import for scanner
import java.io.*;// import for file
public class excersizesixseventeen {
	public static void main (String[] args) throws FileNotFoundException{
		inputStats(new Scanner(new File("lewiscarroll.txt")));//calls method with our file
	}
	public static void inputStats(Scanner input) {
		String line=""; //empty string
		int len = 1;//starts so that it is at line 1, not line 0
			
			while(input.hasNextLine()) {//scans each line
				String s_string = input.nextLine();
			
			Scanner s = new Scanner(s_string);
			
			int token = 0;//starts of our numbers at zero
			int longest=0;
			
				while (s.hasNext()) {
					String word = s.next();
					token++;//increases token for each line till it gets to the end
			
						if (longest < word.length()) {//calculates our longest token for each line
							longest = word.length();
						}
				}
	System.out.printf("Line %d has %d tokens (longest = %d)\n", len, token, longest);//prints line, token, and longest token of each line
		len++;
		if (line.length() < s_string.length()) { //gives us the longest line in the file
			line = s_string;
		}
    }
    System.out.println("Longest line: " + line);//prints the longest line in the file
	}
}

