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
    //int max=arr[0];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    /* 
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
    System.out.println("Second max element: " + max2);*/
    
    int res[]=new int[n];
    for(int i=0;i<n;i++){
      int count1=0;
      while(arr[i]!=0){
        int r=arr[i]%10;
        count1 ++;
      arr[i]=arr[i]/10;
      res[i]=count1;
    }
  }
  int count2=0;
  for(int i=0;i<n;i++){
    
    if(res[i]%2==0){
      count2 ++;
      
    }
  }
  System.out.println("no of even count difgits:"+count2);
  }
}
