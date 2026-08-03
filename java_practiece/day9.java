/*  import java.util.*;
class day9{
    public int[] buildArray(int[] nums) {
      int[] ans=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
      } 
      return ans;
    }
    public static void main(String args[]){
        SumArray s=new SumArray();
        int nums[]={0,2,1,5,3,4};
        System.out.println(java.Arrays.toString(s.day9(ans[i])));

    }
}*/
import java.util.Scanner;
class day9{
  public static void main(String args[]){
    //largest element 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int max=arr[0];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println("First max element: " + max);
    int max2=arr[0];
    for(int i=1;i<n;i++){
      if(arr[i]> max2 && arr[i]!=max){
        max2=arr[i];
      }
    }
    System.out.println("Second max element: " + max2);
  }
}