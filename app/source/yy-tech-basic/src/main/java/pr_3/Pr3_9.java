package pr_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pr3_9 {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        int day = Integer.parseInt( br.readLine() );
       System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
       System.out.println("0=午前、1=午後、2=夜間");
       if(day == 0)
    	   System.out.println("休診");
       
    }
}
