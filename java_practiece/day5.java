/*import java.util.Scanner;
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


import java.util.*;
class day5{
    public static int Product(int a,int b){
        int prod=a*b;
        System.out.println(prod);
        return prod;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Product(a,b);
    }
}
    */

import java.util.*;
class day5{
public static int Factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;

    }
    System.out.println(fact);
    return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        Factorial(sc.nextInt());
    }
}
