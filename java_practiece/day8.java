/*import java.util.Scanner;
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
import java.util.Scanner;
class day8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
            
        }
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
            }
        } 

    

*/
import java.util.Scanner;
class day8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }   
            if(min>arr[i]){
                min=arr[i];
            }
        }
    
            System.out.println("The minimum value of the array is :"+ min);
            System.out.println("The maximum value of the arrray is : "+max);
    }
        

            }
        

    


