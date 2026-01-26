import java.util.Scanner;

public class Vowel_Constant 
{
    
    public static void main(String[] args) 
    {


        //vowel and constant
        Scanner sc =new Scanner(System.in);
         System.out.println("enter word : ");
        String str1 = sc.next();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str1.length(); i++) 
        {
            char ch = str1.charAt(i);

            if (Character.isLetter(ch)) 
            {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
                {
                    vowels++;
                } 
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
      
        
    }
}

    
