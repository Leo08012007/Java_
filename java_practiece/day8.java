import java.util.Scanner;
class day8{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("found at index: "+i);

            

            }
        }//linear search 

    }

}
