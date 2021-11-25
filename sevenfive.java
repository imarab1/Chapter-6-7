public class sevenfive {
	public static void main (String[] args) {
		int[] array = {27,15,15,11,27};
		System.out.println(mode(array)); // calls our method with our array
	}
	
	public static int mode(int[] array) {
	int[] a = new int[101]; // This give us a limit of 100 when evalutating our array, if we increase it then the number we can put in our array increases
    
		for (int i = 0; i < array.length; i++) {//this evalutates our array within our length
        a[array[i]]++;
		}
    
		int val = 0;//gives us starting values, I think of them as empty waiting integers for our loop
		int count = 0;
    
		for (int j = 1; j < a.length; j++) { //this picks out our numbers
			if (a[j] > count) {
				count = a[j];
				val = j;
			}
		}
		return val;//returns our value
	}
}
