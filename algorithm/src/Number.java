import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Number {
    private PrintWriter out;
    private int[] a,book;
    private int n;
    public Number(int n) throws FileNotFoundException {
        this.a=new int[n];
        this.book=new int[n];
        this.n=n;
        out=new PrintWriter("E:\\FullyArrange.txt");
    }
    public void set(int pos) {
        if(pos == n) {
            out.println(Arrays.toString(a));
            return;
        }
        for(int i=0;i<n;i++){
            if(book[i]==0){
                a[pos] = i+1;
                book[i] = 1;
                set(pos+1);
                book[i]=0;
            }
        }
    }
    public void close(){
        this.out.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Number n=new Number(in.nextInt());
        long startTime=System.currentTimeMillis();
        n.set(0);
        n.close();
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间：" +(endTime-startTime)+ " ms");
    }

}
