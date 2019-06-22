import java.io.*;
import java.util.*;
class weightofhillpattern
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the height of hill");
        int height=obj.nextInt();
        System.out.println("enter value of initial node");
        int inti =obj.nextInt();
        System.out.println("enter the increment value");
        int incre= obj.nextInt();
        int count=0;
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
                count=inti+count;
            }
            inti=inti+incre;
            System.out.println(" ");
        }
        System.out.println(count);
    }
}
