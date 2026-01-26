import java.util.Scanner;
public class Jagged_array 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
       
        //flight seat booking
        // business - class  = 3
        // first - class = 5
        // economy - class  = 8
        
        //print flight structure
         boolean flight[][]={ new boolean[3],
                              new boolean[5],
                               new boolean[8] 
                            };
        boolean flag=true;
        while (flag) 
        {
           System.out.println("welcome to flight seat booking ");  
            for(int i= 0;i<flight.length;i++)
            {
                System.out.print(i==0?"business (1 - "+flight[i].length+" ): ":i==1?"first (1 -"+flight[i].length+" ):":"Economy(1 - "+flight[i].length+")" );
                for(int j=0;j<flight[i].length;j++)
                {
                    System.out.print("["+(flight[i][j]?"x":" ")+"]");
                }
                System.out.println();
            }
            //seat booking
            System.out.println("\n---------------- menu --------------\n1.business (price - 10000)\n2.First (price - 8000)\n3.economy (price - 5000)\n4.exit ");
            int row= sc.nextInt();
            if(row == 4)
            {
                System.out.println("----------------------- THANK YOU ----------------");
                return;
            }
            if(row<1||row>3)
            {
                System.out.println("invalid choice ");
                continue;

            }
            System.out.println("enter seat between (1 - "+flight[row-1].length+")");
            int col = sc.nextInt();
            if(col<1 || col>flight[row-1].length)
            {
                System.out.println("invalid choice please try again .......");
                continue;
            }
            
            if (flight[row - 1][col - 1]==true)
            {
                System.out.println("Seat already booked Please enter another seat.");
                continue;
            }

            flight[row-1][col-1]=true;
            System.out.println("seat booked successfully "); 
        }


    }
}
