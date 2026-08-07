/*import java.util.*;
public class day13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name1 = "Bhargavi";
        for(int i=0;i<name1.length();i++){
            System.out.println(name1.charAt(i));
        }
        System.out.println(name1.length());
        String name2="Bhargavi";
        if(name1.compareTo(name2)==0){
            System.out.println("same");
        }else{
            System.out.println("no");
        }
        if(new String("tony")== new String("tony")){
            System.out.println("s");
        }else{
            System.out.println("no");
        }
        if(name1.equals(name2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(name1.substring(0,7));
        String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number+10);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       String s3=s1+s2;
       System.out.println(s3.length());

    }
    
}
import java.util.*;
public class day13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        
        }
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=0;i<n;i++){
            count=arr[i].length()+count;

        }
        System.out.println(count);
        String email1=sc.next();
        for(int i=0;i<email1.length();i++){
            if(email1.charAt(i) == '@'){
                System.out.println(email1.substring(0,i));
                break;

            }
            }
        }


    }*/
    //repalce the char e with i 
    
import java.util.*;
public class day13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String one=sc.next();
        String two="";
        for(int i=0;i<one.length();i++){
            if(one.charAt(i)=='e'){
                two+='i';
            }else{
                two+=one.charAt(i);
            }

        
        }
        System.out.println(two);
    }
}



