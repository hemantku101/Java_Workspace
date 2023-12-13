package get_start_programs;

public class PrimePalindrom02 {
	public void demo(int num) {
	int rev,temp,cnt,c=0;
	while(num!=0)
	{
		temp=num;
		rev=0;
		while(temp!=0)
		{
			int x=temp%10;
			rev=rev*10+x;
			temp=temp/10;
		}
		if(rev==num)
		{
			cnt=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				cnt++;
			}
			if(cnt==0)
			{
				System.out.println(num);
				c++;
			}
			if(c==100)
				System.exit(0);
		}
		num++;
	}
}
public static void main(String[] args) 
{
	PrimePalindrom02 t=new PrimePalindrom02();
	t.demo(2);
}
}