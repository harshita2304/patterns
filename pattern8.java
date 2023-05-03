import java.util.*;
class pattern8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            int a=2;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a);
                a+=2;
            }
            System.out.println();
        }
    }
}