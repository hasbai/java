import java.io.IOException;
import java.io.PrintWriter;

public class F {
    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter("E:\\fuck.txt");
        long i=0;
        while(i<=99){
            out.println(i);

            i++;
        }
        out.close();
    }
}
