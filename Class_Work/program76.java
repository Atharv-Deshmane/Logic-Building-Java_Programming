import java.util.*;

class program76
{
    public static void main(String a[]) throws IOException 
    {
        int iNo = 0;
        int i = 1;
        
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");

       
        iNo = Integer.parseInt(bobj.readLine());
        
        
        for(i = 1 ; i<=(iNo/2);i++)
        {
            if((iNo/2) == 0)
            {
                System.out.println(i);

            }
        }
    }
}