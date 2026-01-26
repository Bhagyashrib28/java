import java.util.Arrays;
import java.util.Scanner;
public class Count
{
    public static void main(String[] args) 
    {
        //count string
      
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        String count[]=str.split(" ");
        System.out.println(Arrays.toString(count));
        String reverse1 = "";

        for (int i = 0; i < count.length; i++) 
        {
            String word = count[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) 
            {
                rev = rev + word.charAt(j);
            }

            reverse1 = reverse1 + rev + " ";
        }

        System.out.println("reverse string is : "+reverse1);
        System.out.println("count of words is "+count.length);      

    }


    
}
