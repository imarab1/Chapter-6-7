public class seveneight {
	public static void main (String[] args) {
		int[] array = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
		System.out.println(median(array)); // calls our method with our array
	}
	
	public static int median(int[] array) {
	int[] a = new int[100];// This give us a limit of 99 when evalutating our array, if we increase it then the number we can put in our array increases
		
		for (int i = 0; i < array.length; i++) { //this evalutates our array within our length
			a[array[i]]++;
		}
		int val = 0;//gives us starting values, I think of them as empty waiting integers for our loop
		int count = 0;
		
		for (int j = 0; j < a.length; j++) { //repeats the if statement
			val += a[j];
			if (val == array.length / 2 + 1) { //calculates our median
				return j;
			}
		}
	return val;// returns our values
	}
		
}

