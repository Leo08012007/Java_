/*import java.util.*;
public class day7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pcount =0;
        int ncount=0;
        int zerocount=0;

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
        
        
        if(num>0){
            pcount++;
            
        }else if (num<0){
            ncount++;
        }else{
            zerocount++;
        }
        }
        System.out.println("positive " + pcount );
        System.out.println("Negative "+ ncount );
        System.out.println("Zero's "+zerocount);
    }
    
}
import java.util.*;
class day7{
    public static void main(String args[]){
        double n=2;
        double x=3;
        double res=Math.pow(n,x);
        System.out.println(res);

    }
}

class day7{
    public static int Gcd(int a,int b){
        while(b!=0){
        int r=a%b;
        a=b;
        b=r;
        
        }
        return a;
    }
    public static int Gcd3(int a, int b,int c){
        int r1=Gcd(a,b);
        return Gcd(r1,c);
    }
    public static void main(String args[]){
        int n1=12;
        int n2=18;
        int n3=24;
        int gcd2=Gcd(12,18);
        int gcd3=Gcd3(12,18,24);
        System.out.println(gcd2);
        System.out.println(gcd3);
    }
}
*/
import java.util.Scanner;
class day7{
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%n==0)&&(n%1==n)){
            System.out.println("Prime");
        }
        
        
}
}
    