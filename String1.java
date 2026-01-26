// Reverse the String
import java.util.Arrays;
import java.util.Scanner;
public class String1 
{
    public static void main(String[] args) 
    {  
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String : ");
        String str1 = sc.next();

        
        //  method 1 

        StringBuffer rev = new StringBuffer(str1);
        rev.reverse();
        System.out.println("original string : "+str1);
        System.out.println("reversed string : "+rev);
        if(str1.equals(rev.toString()))
        {
            System.out.println("string is palinddrome");
        }
        else
        {
            System.out.println("string is not  palinddrome");
        }


        System.out.println();

        // method 2

        String rev1 = "";
        for(int i=str1.length()-1;i>=0;i--)
        {
            rev1=rev1+str1.charAt(i);
            
        }
        System.out.println("original string : "+str1);
        System.out.println("reversed string : "+rev1);
        if(str1.equals(rev1))
        {
            System.out.println("string is palinddrome");
        }
        else
        {
            System.out.println("string is not  palinddrome");
        }        

    }    
}
