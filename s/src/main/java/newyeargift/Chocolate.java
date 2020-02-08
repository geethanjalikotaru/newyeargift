package newyeargift;

import java.util.Scanner;

public class Chocolate implements InputChocisSweets{
	int weight=0;
	public int inputgift()
	{
		System.out.println("enter chocolate type 1.kitkat 2.milkybar");
		Scanner s=new Scanner(System.in);
		int type=s.nextInt();
		return type;
	}

}
