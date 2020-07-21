package designs.lamdaFumctions;
import java.io.IOException;
import java.util.*;

public class AverageofIntegers {
	public static double average(List list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=(Integer)list.get(i);
		}
		double average=sum/(list.size());
		return average;
	}
	public static void  main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int num=0;
		String ch=" ";
		do {
			System.out.println("Enter number");
			num=sc.nextInt();
			list.add(num);
			System.out.println("Do you want to continue? yes or no");
			sc.nextLine();
			ch=sc.nextLine();
		}while(ch.equals("yes"));
		
		double x=average(list);
		System.out.println(x);
		sc.close();
	}
}
