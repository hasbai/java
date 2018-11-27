import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String a ="Amd";
        System.out.println(a.substring(0,1)+a.substring(1,2));
        int[] n=new int[4];
        int number=1234;
        for(int i=0;i<4;i++){
            n[i]=(number%(int)Math.pow(10,i+1)-number%(int)Math.pow(10,i))/(int)Math.pow(10,i);
        }
        System.out.println(Arrays.toString(n));
        //if(true)
        Scanner in=new Scanner(System.in);
        int input=(int)in.nextInt();

    }
}
