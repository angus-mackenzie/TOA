import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Scoring {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Integer NumNumber = Integer.parseInt(scanner.nextLine());
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		for (int i=0; i<NumNumber; i++) {
			Numbers.add(Integer.parseInt(scanner.nextLine()));
		}
		
		Integer Target = Integer.parseInt(scanner.nextLine());
		
		ArrayList Max = new ArrayList();
		
		Scoring score = new Scoring(); 
        Max =(score.recursive(0, 1, Numbers, Max, Target)); 
        //System.out.println(Max);
        System.out.println(Collections.max(Max));
	}
	public ArrayList recursive(int index, int count, List<Integer> Numbers, ArrayList Max, int Target) {
	    if(index==Numbers.size()) {
	    	//System.out.println(count);
	    	if(count<Target) {
	    		Max.add(count);
	    	}
	        return Max;
	    } else {
	        recursive(index+1, count+Numbers.get(index), Numbers, Max, Target);
	        recursive(index+1, count*Numbers.get(index), Numbers, Max, Target);
	        return Max;
	        
	    }
	}
}

