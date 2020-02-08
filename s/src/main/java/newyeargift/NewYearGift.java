package newyeargift;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class NewYearGift {
	public static void main(String args[])
	{
		int totalsweetsweight=0;
		int totalchocolateweight=0;
		int range=0;
		int sweetscount=0;
		int chocolatecount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the gift");
		range=s.nextInt();
		System.out.println("enter lower price limit");
		int lp=s.nextInt();
		System.out.println("enter upper price limit");
		int up=s.nextInt();
		List<String> inRange = new ArrayList<>();
		for(int i=0;i<range;i++) 
		{
			Sweets sw=new Sweets();
			int stype=sw.inputgift();
			if(stype==1)
			{
				Laddu l=new Laddu();
				if(l.returnweight()>=lp && l.returnweight()<=up) {
				if (inRange.contains("Laddu")==false) {
				inRange.add("Laddu");}
				totalsweetsweight=totalsweetsweight+l.returnweight();
				}
				else {
					System.out.println("sorry Laddu price is not in range");
				}
			}
			if(stype==2)
			{
				Rasmali r=new Rasmali();
				if(r.returnweight()>=lp && r.returnweight()<=up) {
					if (inRange.contains("Rasmali")==false) {
						inRange.add("Rasmali");}
				totalsweetsweight=totalsweetsweight+r.returnweight();}
				else {
					System.out.println("sorry Rasmali price is not in range");
				}
			}
			sweetscount++;
			Chocolate cw=new Chocolate();
			int ctype=cw.inputgift();
			if(ctype==1)
			{
				KitKat k=new KitKat();
				if(k.returnweight()>=lp && k.returnweight()<=up) {
					if (inRange.contains("Kitkat")==false) {
						inRange.add("kitkat");}
				totalchocolateweight=totalchocolateweight+k.returnweight();}
				else {
					System.out.println("sorry Kitkat price is not in range");
				}
			}
			if(ctype==2)
			{
				Milkybar m=new Milkybar();
				if(m.returnweight()>=lp && m.returnweight()<=up) {
					if (inRange.contains("milkybar")==false) {
						inRange.add("milkybar");}
				totalchocolateweight=totalchocolateweight+m.returnweight();}
				else {
					System.out.println("sorry milkybar price is not in range");
				}
			}
			chocolatecount++;
		}
		System.out.println("total sweets is "+sweetscount);
		System.out.println("total no of candies"+chocolatecount);
		System.out.println("total weight of giftbox is"+(chocolatecount*totalchocolateweight+sweetscount*totalsweetsweight));
		System.out.println("number of candies in range are");
		for (int i=0; i<inRange.size(); i++) 
            System.out.println(inRange.get(i)+" "); 
	}
}
