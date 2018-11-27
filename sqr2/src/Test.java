
import java.util.*;
import java.nio.file.*;
import java.io.*;
//import java.nio.file.*;
public class Test
{
	public static void main(String[] args)throws IOException
	{ 
		/*int[] a= {0,2,6};
		int[] b ={1,0,0};
		for(int i=0;i<a.length;i++){
			a[i]=b[i];
		}
		for(int i:a){
			System.out.println(i);
		}
		System.out.println(a.length);*/
		Scanner compare=new Scanner(Paths.get("/storage/emulated/0/compare.txt"),"UTF-8");
		Scanner sqr=new Scanner(Paths.get("/storage/emulated/0/sqr2.txt"),"UTF-8");
		String c=compare.nextLine();
		String s=sqr.nextLine();
		if(c.equals(s.substring(0,c.length()))){
			System.out.println("true");
		}
	}
}
