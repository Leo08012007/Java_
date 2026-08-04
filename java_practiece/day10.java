/*import java.util.Scanner;
public class day10 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                System.out.println(i+" "+j);
            }
        }
        }
    }
    
}
import java.util.Scanner;
public class day10 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         int max=0;
        for(int i=0;i<rows;i++){
            int csum=0;
            for(int j=0;j<cols;j++){
                csum=csum+ arr[i][j];
                
            }
            System.out.println(csum);
            if(max<csum){
                max=csum;
            }
            

        }
        System.out.println(max);
    }
}

// reversing of an array

import java.util.Scanner;
public class day10 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            /*int res[]=new int[n];
            for(int i=0;i<n;i++ ){
               res[i]=arr[n-(i+1)];
               System.out.println(res[i]);
            }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
            System.out.print(arr2[i]+" ");
        }

        }
    }

import java.util.Scanner;
public class day10 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int firstc=0;
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                firstc=count;
            }
            if(arr[i]==0){
                count=0;
            }
        }
        System.out.println(firstc);
        System.out.println(count);
        }
        }
    */
   import java.util.*;
public class day10 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int firstc=0;
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int max=arr[0];
            int min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[0]){
                min=arr[i];
            }
        }
            int MaxMin[]=new int[2];
            MaxMin[0]=max;
            MaxMin[1]=min;
        System.out.println(Arrays.toString(MaxMin));
        for(int i=min;i<max;i++){
            int values=i;
            System.out.println(values);
            for(int j=0;j<arr.length;j++){
                
            }

        }
        }
    }
