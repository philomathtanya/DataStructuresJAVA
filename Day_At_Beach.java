import java.util.*;
 
public class Day_At_Beach {
 
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] left=new int[n+1];
        left[0]=Integer.MIN_VALUE;
  int[] right=new int[n+1];
        right[n]=Integer.MAX_VALUE;
       
  for(int i=1;i<n+1;i++)
  {
            left[i]=Math.max(left[i-1],a[i-1]);
        }
       
        for(int i=n-1;i>=0;i--){
            right[i]=Math.min(right[i+1],a[i]);
        }
        int ans=1;
        for(int i=1;i<n;i++){
            if(left[i]<=right[i]){
                ans++;
            }
        }
        System.out.println(ans);
  }
 
}

