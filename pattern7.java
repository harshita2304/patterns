import java.util.*;
class pattern7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        char ch='Z';
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch--;
        }
    }
}