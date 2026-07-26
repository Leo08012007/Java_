import java.util.Scanner;
class day5{
    public static int Sumof2(int a ,int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;


    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        Sumof2(a,b);
    }
}


import java.util.Scanner;
class day5{
    public static void MyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String name=sc.next();
        MyName(name);
    }
}