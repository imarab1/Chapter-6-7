import java.util.*;// for arrays.toString

public class seventwenty {
	
	public static void main (String[] args) {
		int matrixA[][] = {{2, 4},{5, 6}}; // our arrays which we are calculating
		int matrixB[][] = {{8, 3},{7, 3}};//
		int[][] arr = matrixAdd(matrixA, matrixB);//calls our method using these two arrays as parameters
 
      for (int i = 0; i < arr.length; i++)
          System.out.println(Arrays.toString(arr[i]));
	}

	public static int[][] matrixAdd(int[][] a, int[][] b){//the method that adds the two arrays
    int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < c.length; i++) {//rows
            for (int j = 0; j < c[0].length; j++) {//columns
                c[i][j] = a[i][j] + b[i][j];//adds them up and stores them in "c"
            }  
        }
        return c;//returns our value
    }
}




