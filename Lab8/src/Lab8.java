import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab8 {
	
	static ArrayList<Double> result = new ArrayList<Double>();
	
	public static void main(String args[]){
		String fileLocation = "C:\\Users\\micha\\Documents\\1000_Primes.txt";
		result = CS2004.ReadNumberFile(fileLocation);
		System.out.println(Arrays.toString(result.toArray()));
	}
}
