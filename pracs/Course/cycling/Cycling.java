import java.util.ArrayList;
import java.util.Scanner;

public class Cycling {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N =Integer.parseInt(scanner.nextLine());
		
		ArrayList table = new ArrayList();
		ArrayList zero = new ArrayList();
		table.add(zero);
		long max = 0;
		
		for(int i=0; i<N; i++) {
			zero =(ArrayList) table.get(0);
			zero.add(0);
			
			ArrayList row = new ArrayList();
			long sign = Long.parseLong(scanner.nextLine());
			row.add(sign);
			table.add(row);
		}
		
		for (int i=1; i<N; i++) {
			ArrayList row = (ArrayList) table.get(i);
			for (int j=1; j<N+1-i; j++) {
				ArrayList bottom_row = (ArrayList) table.get(j+i);
				long value =(Long) row.get(j-1)+ (Long)bottom_row.get(0);
				row.add(value);
				if (value>max) {
					max = value;
				}
			}
		}
		
		System.out.println(max);
	}
}
