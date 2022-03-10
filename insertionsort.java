//isertion sorting in java programing[8,4.3.5.5] first loop work right and another work left
import java.util.*;
public class insertionsort
{
    public int[] inserSearch(int arr[],int loop,int i,int j)
    {
        for(i=1;i<loop;i++)
        {
            int temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void main(String args[])
    {
        insertionsort obj=new insertionsort();
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        int arr[]=new int[100];
        int loop=sc.nextInt();
        for(i=0;i<loop;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=obj.inserSearch(arr, loop, i, j);
        for(i=0;i<loop;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}