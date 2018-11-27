import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Big s=new Big(); 
		Big a=new Big();
		int[] s0=new int[]{1,4};
		int[] a0=new int[]{1,9,6};
		s.set(s0);
		a.set(a0);
		for(int i=2;i<=1024;i++){
			for(int j=9;j>=0;j--){
				//int[] temp=s.back(i).get();
				int[] ds=s.back(i).times(2*j);
				ds[2*i]+=((int)Math.pow(j,2))%10;
				ds[2*i-1]+=((int)Math.pow(j,2))/10;
				int[] da=a.add(ds);
				if(a.add(ds)[0]<2){
					a.set(a.add(ds));
					s.set0(i,j);
					break;
				}
			}
		}
		//PrintWriter out =new PrintWriter("/storage/emulated/0/sqr2.txt");
		PrintWriter out =new PrintWriter("E:\\sqr2.txt");
		out.print("1.");
		for (int i=1;i<=1024;i++){
			out.print(s.get0(i));
		}
		out.close();


	}
}
