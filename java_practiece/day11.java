/*import java.util.Scanner;

public class day11 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
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
System.out.println(arr[i]+" "+ count);

}
        }
}*/
import java.util.Arrays;
import java.util.Scanner;

public class day11 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int val =0;
        int i=0;
        int pow=n-1;
        while(n!=0&&i<n){
        int sum=(int)(arr[i]*Math.pow(10,pow));
        val=sum+val;
        i++;
        pow--;
//let 1000=n
       
}
int num1=val+1;
System.out.println(num1);
int temp=num1;
int count=0;
while(temp>0){
    int rem1=temp%10;
    count++;
    temp=temp/10;
}
    System.out.println(count);
int p=count-1;
int res[]=new int[count];
while(num1!=0&&p>=0){
int rem=num1%10;
    res[p]=rem;
    p--;
num1=num1/10;
}

System.out.println(Arrays.toString(res));


    }
}
// this code fails in leetcode as the 10,pow for larger values exceeds the max integer value in java 

