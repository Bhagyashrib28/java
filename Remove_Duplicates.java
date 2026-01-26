import java.util.Arrays;
import java.util.Scanner;
public class Remove_Duplicates 
{
    public static void main(String[] args) 
    {
      
        //remove duplicates in string

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter any string : ");
        String str2=sc1.nextLine();
        String remove= " ";
        for(int i=0;i<str2.length();i++)
        {
            char ch = str2.charAt(i);
            if(remove.indexOf(ch)==-1)
            {
                remove+=ch;
            }
        }
        System.out.println("after remove duplicateas string is : "+remove);        

    }    
}
