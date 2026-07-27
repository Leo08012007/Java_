import java.util.*;
public class task3 {
    public static int BinarySearch(int[] arr,int target ){
        int low=0;
        int high =arr.length -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                System.out.println("Elemnt not found");
            }
            System.out.println(arr[target]);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        BinarySearch(val,target);

    sc.close();

    }
    
}
