import java.util.Scanner;
class FirstClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3.Divison");
        System.out.println("4.Multiplication");
        int choice=sc.nextInt();
        System.out.println("Enter 2 numbers ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        switch(choice){
            case 1: 
            int sum=a+b;
            System.out.println(sum);
            break;
            case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
            case 3:
                if(b==0){
                    System.out.println("Division by zero is not possible choose different number");
                }else{
                    int div=a/b;
                    System.out.println(div);
                }
                break;
            case 4:
                int mul=a*b;
                System.out.println(mul);
                break;
            default:
                System.out.println("Thank you");


        }
        sc.close();
        
    }
}