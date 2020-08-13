import java.util.*;
class minutes
{
	public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter minutes");
int m=ob.nextInt();
int years=0,days;
System.out.println("minutes="+m);
days=m/1440;
if(days>365)
years=days/365;
else
System.out.println("Days= "+days);

System.out.println("years ="+years);
days=days%365;
System.out.println("remaining days= "+days);
}
}