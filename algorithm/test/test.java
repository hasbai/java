import java.util.Scanner;

public class test {
    static int[] a,book;
    static int n;
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        long startTime=System.currentTimeMillis();
        a=new int[n];
        book=new int[n];

        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+" ms");
    }
    public static void set(int pos){
        if(pos==n){
            for(int i:a){
                System.out.print(i);
            }
            System.out.println("");
            return;
        }

    }
}
