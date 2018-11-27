import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("新游戏");
        System.out.println("请输入1000到9999的整数，各位数码不能重复");
        System.out.println("A表示数码的值和位置均正确，B表示数码仅值正确，位置不一定正确");
        System.out.println("");
        Number key = new Number();
        key.change(random());
        while(key.check()==1){key.change(random());}
        //System.out.println(Arrays.toString(key.getNumber()));
        int cnt=0;
        while (true) {
            System.out.println("请输入数字");
            cnt++;
            Number number=new Number();
            int input=(int)in.nextInt();
            number.change(input);
            while(number.check()==1){
                System.out.println("不要重复");
                number.change(in.nextInt());
            }
            String result=number.compare(key);
            System.out.println(result);
            System.out.println("");
            if(result.equals("A4B4")){
                System.out.println("你赢了!");
                System.out.println("你猜了 "+cnt+" 次");
                break;
            }
        }
    }
    public static int random(){
        int flag = new Random().nextInt(9999);
        if (flag < 1000)
        {
            flag += 1000;
        }

        return flag;
    }
}
class Number {
    private int[] number;
    public Number(){
        number=new int[4];
    }
    public void change(int number){
        for(int i=0;i<4;i++){
            this.number[i]=(number%(int)Math.pow(10,i+1)-number%(int)Math.pow(10,i))/(int)Math.pow(10,i);
        }
    }
    public String compare(Number key){
        int a=0;
        int b=0;
        for (int i=0;i<4;i++){
            if (this.number[i]==key.number[i]){a++;}
        }
        for (int i=0;i<4;i++){
            for(int j : key.number){
                if(j==this.number[i]){b++;}
            }
        }
        return "A"+a+"B"+b;
    }
    public int check() {
        int flag=0;
        for (int i=0;i<3;i++){
            if(this.number[i]==this.number[i+1]){flag= 1;}
        }
        return flag;
    }
    public int[] getNumber(){
        return this.number;
    }

}