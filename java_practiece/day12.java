/*import java.util.*;
class day12{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){

            if(arr[i]==arr[j]){
                count++;
            }
        }
        System.out.println(count);
        }

    }
}
*/
import java.util.*;
class day12{
    public static void main (String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int arr : nums){
            int count=map.getOrDefault(arr, 0)+1;
            map.put(arr,count);
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()){
            System.out.println("Key: "+e.getKey()+" "+" value: "+e.getValue());
        }

         
    }
}
