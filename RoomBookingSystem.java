import java.util.Scanner;
public class RoomBookingSystem 
{
    public static void main(String[] args) 
    {
     int f=5;
     int r=5;
     Scanner scanner=new Scanner(System.in);
     char[][] room=new char[f][r];
     for(int i=0;i<f;i++)
     {
        for(int j=0;j<r;j++)
        {
            room[i][j]='A';
          
        }
     }
     while(true){
        System.out.println("1.Display \n2.Book Room \n3.Exit");
        System.out.println("Enter your choice: ");
        int ch=scanner.nextInt();
        if (ch==3) 
        {
           System.out.println("Thank You For Visiting");
           break; 
        }
        switch (ch) 
        {
            case 1:
                System.out.print(" Room - ");
                for(int j=0;j<r;j++)
                {
                    System.out.print(" "+(j+1));
                }
                System.err.println("");
                for(int i=0;i<f;i++)
                {   System.out.print("Floor"+(i+1)+"- ");
                    for(int j=0;j<r;j++)
                    {
                        System.out.print(" "+room[i][j]);;
          
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Enter Floor: ");
                int fl=scanner.nextInt();
                System.out.println("Enter Room: ");
                int ro=scanner.nextInt();
                if(fl<=f) 
                {
                    if (ro<=r) 
                    {
                         room[fl-1][ro-1]='B';
                    } 
                    else
                    {
                       System.out.println("Invalid Choice"); 
                    }
                    
                }
                else
                {
                    System.out.println("Invalid Choice");
                }
                 System.out.print(" Room - ");
                for(int j=0;j<r;j++)
                {
                    System.out.print(" "+(j+1));
                }
                System.err.println("");
                for(int i=0;i<f;i++)
                {   System.out.print("Floor"+(i+1)+"- ");
                    for(int j=0;j<r;j++)
                    {
                        System.out.print(" "+room[i][j]);;
          
                    }
                    System.out.println("");
                }
                break;        
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
  }
}
