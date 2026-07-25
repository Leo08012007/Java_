import java.util.Scanner;
class task7 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            
        if(rem%2==0){
       
            sum=sum+rem;
        }
    }
       
            
            System.out.println(sum);
            
}
}