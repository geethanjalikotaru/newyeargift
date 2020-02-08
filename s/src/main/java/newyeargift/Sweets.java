package newyeargift;
import java.util.*;
public class Sweets implements InputChocisSweets{
	int weight=0;
	public int inputgift()
	{
		System.out.println("enter sweets type 1.laddu 2.rasmali");
		Scanner s=new Scanner(System.in);
		int type=s.nextInt();
		return type;
	}

}